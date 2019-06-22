#!/bin/bash

java -jar -Dspring.profiles.active=abc-service-replica05 ./target/SpringCloudDiscoveryEurekaClient-0.0.1.jar
