# Getting Started

This project is about sending/receiving messages through a Kafka broker.

### Spin up Kafka services

To spin up the Kafka services, run:

```bash
docker compose up -d
```


### Run the spring boot application.

```bash
./gradlew bootRun
```

### Send messages to the Kafka broker

Once application is up and running, you can send messages to the Kafka broker via the rest API.

Swagger for the API is available at:

http://localhost:8080/swagger-ui/index.html


For observing the messages, you can use the Kafka UI app:

http://localhost:8090/
