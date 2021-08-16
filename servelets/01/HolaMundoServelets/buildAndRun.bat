@echo off
call mvn clean package
call docker build -t ar.com.linkdeveloper/HolaMundoServelets .
call docker rm -f HolaMundoServelets
call docker run -d -p 9080:9080 -p 9443:9443 --name HolaMundoServelets ar.com.linkdeveloper/HolaMundoServelets