Java Spring Boot framework with Containerization


Build with Maven

mvn package

Run locally

java -jar target/gs-spring-boot-docker-0.1.0.jar

Test web app locally

http://localhost

Containerize

Build a docker image using Dockerfile:
docker build -t web-docker .

Run docker image locally

docker run --publish  8080:8080 web-docker
Then you can access the web app at http://localhost:8080 in browser.
