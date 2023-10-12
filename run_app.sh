#!/bin/sh

./mvnw clean package -DskipTests 

sudo docker compose up --build