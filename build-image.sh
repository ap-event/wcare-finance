#!/usr/bin/env bash

echo "build Started ...."

docker login default-route-openshift-image-registry.apps.demo.ibmdte.net -u $(oc whoami) -p $(oc whoami -t)
docker build -t wcare-ns/wcarefinance:latest .
docker tag wcare-ns/wcarefinance:latest  default-route-openshift-image-registry.apps.demo.ibmdte.net/wcare-ns/wcarefinance:latest
docker push  default-route-openshift-image-registry.apps.demo.ibmdte.net/wcare-ns/wcarefinance:latest

echo "build completed ...."
