Spring Boot with Kafka Producer Example
This Project tells us to use Spring Boot with Spring Kafka to Publish JSON Object / String message to a particular Kafka topic

1. First start Zookeeper server (Using CMD under \bin folder of kafka binary file)
zookeeper-server-start.bat C:\kafka_2.12-2.8.0\config\zookeeper.properties

Start Kafka Server (Using CMD under \bin folder of kafka binary file)
kafka-server-start.bat C:\kafka_2.12-2.8.0\config\server.properties

Create Kafka Topic
kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic damodarjava

*Note: damodarjava is the topic name and replication-factor is for declaring 1 no. of node for handling fault tolerance.

Consume from the Kafka Topic via Console
kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic damodarjava --from-beginning