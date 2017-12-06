
#
## Bloombox: Java API Client
#

CLIENT_VERSION ?= 1.0-SNAPSHOT
TARGET ?= target/
TARGET_JAR ?= $(TARGET)java-client-$(CLIENT_VERSION).jar


all: build

build: $(TARGET_JAR)

clean:
	@echo "Cleaning Java client artifacts..."
	@rm -fr $(TARGET)

$(TARGET_JAR):
	@echo "Building Java Client for Bloombox..."
	@mvn clean package install

