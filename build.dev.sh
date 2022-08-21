#!/usr/bin/env bash

TAG="dev"
APP_NAME="demo-cronjob"
REGISTRY_PATH="phatcahcrin/$APP_NAME:$TAG"

./gradlew --build-file "build.gradle.kts" clean build -x test

docker rmi "$(docker images | grep $APP_NAME)"

docker build . -t $REGISTRY_PATH

docker push $REGISTRY_PATH

echo "> Copy successful..."
