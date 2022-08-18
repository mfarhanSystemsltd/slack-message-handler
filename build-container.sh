mvn clean package
podman build -f src/main/docker/Dockerfile.jvm -t quay.io/gnunn/slack-message-handler:latest .