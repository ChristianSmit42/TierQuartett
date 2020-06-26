FROM openjdk:14

ENV ENVIRONMENT=prod

MAINTAINER Geilstes Team <pokepommes@gmail.com>

ADD target/tierquartett.jar app.jar

CMD ["sh", "-c", "java -Dserver.port=$PORT -jar /app.jar"]