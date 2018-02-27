
# Copyright © 2018 Bloombox, LLC.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
# http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

#
## Bloombox: Java API Client
#

BUILDMODE ?= maven
TESTS ?= yes
RELEASE_VERSION ?= 1.0-rc9
CLIENT_VERSION ?= 1.0-SNAPSHOT
SERVICE_ARGS ?= -Dbloombox.shop.version=$(SHOP_VERSION) -Dbloombox.telemetry.version=$(TELEMETRY_VERSION)
SCHEMA ?= schema/
RELEASE_ARGS ?= -DperformRelease=true
RELEASE_GOALS ?= release:prepare release:perform
EMBEDDED_SCHEMA ?= yes
CURRENT_BRANCH ?= $(shell git rev-parse --abbrev-ref HEAD)

ifeq ($(BUILDMODE),maven)
TARGET ?= target/
TARGET_JAR ?= $(TARGET)java-client-$(CLIENT_VERSION).jar
DEFAULT_GOALS = clean package install
endif
ifeq ($(BUILDMODE),gradle)
TARGET ?= build/
TARGET_JAR ?= $(TARGET)java-client-$(CLIENT_VERSION).jar
DEFAULT_GOALS = clean build
endif

GOALS ?= $(DEFAULT_GOALS)


all: build

EXTRA_FLAGS ?=

ifeq ($(TESTS),no)
EXTRA_FLAGS += -DskipTests
endif


ifeq ($(EMBEDDED_SCHEMA),yes)
POMFILE ?= pom.xml
else
POMFILE ?= pom-embedded.xml
endif

build: $(TARGET_JAR)

clean:
	@echo "Cleaning Java client artifacts..."
	@rm -fr $(TARGET)

ifeq ($(EMBEDDED_SCHEMA),yes)
ifeq ($(BUILDMODE),maven)
$(TARGET_JAR):
	@echo "Building Java Client for Bloombox (Maven)..."
	@mvn -f $(POMFILE) $(GOALS) -Dproject.version=$(CLIENT_VERSION) -Dbloombox.snapshot $(SERVICE_ARGS) $(EXTRA_FLAGS)
endif
ifeq ($(BUILDMODE),gradle)
$(TARGET_JAR):
	@echo "Building Java Client for Bloombox (Gradle)..."
	@gradle $(GOALS) -Dproject.version=$(CLIENT_VERSION) -Dbloombox.snapshot $(SERVICE_ARGS) $(EXTRA_FLAGS)
endif
else
ifeq ($(BUILDMODE),maven)
$(TARGET_JAR):
	@echo "Cleaning embedded schema..."
	@rm -frv src/main/java/io
	@echo "Building Java client for Bloombox (Maven)..."
	@mvn -f $(POMFILE) $(GOALS) -Dproject.version=$(CLIENT_VERSION) -Dbloombox.snapshot $(SERVICE_ARGS) $(EXTRA_FLAGS)
endif
ifeq ($(BUILDMODE),gradle)
$(TARGET_JAR):
	@echo "Cleaning embedded schema..."
	@rm -frv src/main/java/io
	@echo "Building Java client for Bloombox (Gradle)..."
	@gradle $(GOALS) -Dproject.version=$(CLIENT_VERSION) -Dbloombox.snapshot $(SERVICE_ARGS) $(EXTRA_FLAGS)
endif
endif

ifeq ($(BUILDMODE),maven)
release:
	@echo "Building release for Bloombox Java Client 'v$(RELEASE_VERSION)'..."
	@mvn -f $(POMFILE) clean package install site:site $(RELEASE_GOALS) -Dproject.version=$(RELEASE_VERSION) -Dbloombox.release $(SERVICE_ARGS) $(RELEASE_ARGS)
	@mvn site:site
	@cd target/site && git init && git add . && git commit -m "Update docs" && git checkout -b gh-pages && git remote add origin git@github.com:bloombox/java.git && git push origin gh-pages --force && rm -fr .git
	@echo "Docs published."
else
release:
	@echo "Releases not supported via any tool other than Maven. Please run with BUILDMODE=maven."
endif

$(SCHEMA):
	@echo "Syncing schema..."
	@git submodule update --init --remote schema

sync-schema: $(SCHEMA)
	@echo "Updating schema..."
	@git submodule update --init --remote schema
	@echo "Building schema..."
	@$(MAKE) -C schema SERVICES=yes TABLES=no LANGUAGES=java PROTO_FLAGS=--javagrpc_out=languages/java
	@echo "Copying schemas..."
	@mkdir -p src/main/java/
	@rm -fr src/main/java/*
	@cp -fr schema/languages/java/ src/main/java/

embedded:
	@echo "Building embedded library..."
	@mvn clean package && echo "Cutting new branch..." && git branch -D embedded && git checkout -b embedded && echo "Removing schema..." && rm -fr src/main/java/* && echo "Schema is not included with embedded library." > src/main/README.md && git add . && git commit -m "Embedded: $(CLIENT_VERSION)" && git push origin embedded --force && git checkout $(CURRENT_BRANCH)

ifeq ($(BUILDMODE),maven)
build-ci:
	@echo "Building from CI (Maven)..."
	@mvn -f pom.xml install -DskipTests=true -Dmaven.javadoc.skip=true -Dgpg.skip -B -V

run-ci:
	@echo "Running tests from CI (Maven)..."
	@mvn -f pom.xml test jacoco:report -B

else
build-ci:
	@echo "Building from CI (Gradle)..."
	@gradle build

run-ci:
	@echo "Running tests from CI (Gradle)..."
	@gradle test
endif

