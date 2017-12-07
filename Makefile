
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

RELEASE_VERSION ?= 1.0-beta1
CLIENT_VERSION ?= 1.0-SNAPSHOT
TARGET ?= target/
TARGET_JAR ?= $(TARGET)java-client-$(CLIENT_VERSION).jar
SERVICE_ARGS ?= -Dbloombox.shop.version=$(SHOP_VERSION) -Dbloombox.telemetry.version=$(TELEMETRY_VERSION)
DEFAULT_GOALS = clean package install
GOALS ?= $(DEFAULT_GOALS)
SCHEMA ?= schema/
RELEASE_ARGS ?=
RELEASE_GOALS ?= release:clean release:prepare release:perform

all: build

build: $(TARGET_JAR)

clean:
	@echo "Cleaning Java client artifacts..."
	@rm -fr $(TARGET)

$(TARGET_JAR):
	@echo "Building Java Client for Bloombox..."
	@mvn $(GOALS) -Dproject.version=$(CLIENT_VERSION) -Dbloombox.snapshot $(SERVICE_ARGS)

release: build
	@echo "Building release for Bloombox Java Client 'v$(RELEASE_VERSION)'..."
	@mvn clean package install site $(RELEASE_GOALS) -Dproject.version=$(RELEASE_VERSION) -Dbloombox.release $(SERVICE_ARGS) $(RELEASE_ARGS)

$(SCHEMA):
	@echo "Syncing schema..."
	@git submodule update --init --remote schema

sync-schema: $(SCHEMA)
	@echo "Building schema..."
	@$(MAKE) -C schema SERVICES=yes TABLES=no LANGUAGES=java PROTO_FLAGS=--javagrpc_out=languages/java
	@echo "Copying schemas..."
	@mkdir -p src/main/java/
	@cp -fr schema/languages/java/ src/main/java/
