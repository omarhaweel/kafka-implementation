# Kafka Implementation with Spring Boot

A Spring Boot application demonstrating Kafka producer functionality with scheduled tasks and multiple topics.

## Features

- **Kafka Producer**: Send orders to Kafka topics via REST endpoints
- **Multiple Topics**: Support for topic1 and topic2
- **Scheduled Tasks**: Automatic order generation every 5 seconds
- **Docker Integration**: Easy setup with Docker Compose
- **Health Check**: Monitor service status

## Prerequisites

- Java 21
- Docker & Docker Compose
- Git


## Quick Start

### 1. Clone the Repository
```bash
git clone https://github.com/omarhaweel/kafka-implementation.git
cd kafka-implementation
```
# Start Zookeeper and Kafka broker
docker-compose up -d

# Verify services are running
docker-compose ps

#
Run the app and test with Postman or curl
send Order in Postman as
http://localhost:8080/kafka/send-to-topic1
{
"orderId": 123,
"productName": "Laptop"
}


