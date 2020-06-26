FROM openjdk:14

ENV ENVIRONMENT=prod

MAINTAINER Geilstes Team <pokepommes@gmail.com>

ADD target/tierquartett.jar app.jar

CMD ["sh", "-c", "java -Dserver.port=$PORT -Dspring.data.mongodb.uri=$MONGO_DB_AUTH -jar /app.jar"]