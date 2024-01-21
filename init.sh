docker build --no-cache -t spring-image .

docker run -p 7000:80 -d --name spring-container --net test-bridge spring-image