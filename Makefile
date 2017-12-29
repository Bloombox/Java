
# Copyright © 2017 Bloombox, LLC.
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

RELEASE_VERSION ?= 1.0-beta8
CLIENT_VERSION ?= 1.0-SNAPSHOT
TARGET ?= target/
TARGET_JAR ?= $(TARGET)java-client-$(CLIENT_VERSION).jar
SERVICE_ARGS ?= -Dbloombox.shop.version=$(SHOP_VERSION) -Dbloombox.telemetry.version=$(TELEMETRY_VERSION)
DEFAULT_GOALS = clean package install
GOALS ?= $(DEFAULT_GOALS)
SCHEMA ?= schema/
RELEASE_ARGS ?= -DperformRelease=true
RELEASE_GOALS ?= release:prepare release:perform
EMBEDDED_SCHEMA ?= yes

all: build

ifeq ($(EMBEDDED_SCHEMA),yes)
POMFILE ?= pom-public.xml
build: sync-schema $(TARGET_JAR)
else
POMFILE ?= pom.xml
build: $(TARGET_JAR)
endif

clean:
	@echo "Cleaning Java client artifacts..."
	@rm -fr $(TARGET)

ifeq ($(EMBEDDED_SCHEMA),yes)
$(TARGET_JAR):
	@echo "Building Java Client for Bloombox..."
	@mvn -f $(POMFILE) $(GOALS) -Dproject.version=$(CLIENT_VERSION) -Dbloombox.snapshot $(SERVICE_ARGS)
else
$(TARGET_JAR):
	@echo "Cleaning embedded schema..."
	@rm -frv src/main/java/io
	@echo "Building Java client for Bloombox..."
	@mvn -f $(POMFILE) $(GOALS) -Dproject.version=$(CLIENT_VERSION) -Dbloombox.snapshot $(SERVICE_ARGS)
endif

release:
	@echo "Building release for Bloombox Java Client 'v$(RELEASE_VERSION)'..."
	@mvn -f $(POMFILE) clean package install site:site $(RELEASE_GOALS) -Dproject.version=$(RELEASE_VERSION) -Dbloombox.release $(SERVICE_ARGS) $(RELEASE_ARGS)
	@mvn site:site
	@cd target/site && git init && git add . && git commit -m "Update docs" && git checkout -b gh-pages && git remote add origin git@github.com:bloombox/java.git && git push origin gh-pages --force && rm -fr .git
	@echo "Docs published."

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
