#!/bin/sh
mvn clean package && docker build -t ar.com.linkdeveloper/HolaMundoServelets .
docker rm -f HolaMundoServelets || true && docker run -d -p 9080:9080 -p 9443:9443 --name HolaMundoServelets ar.com.linkdeveloper/HolaMundoServelets