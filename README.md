# spring-boot-apache-kafka-stream

Refer - https://www.vinsguru.com/kafka-streams-real-time-data-processing-using-spring-boot/

- Producers keep on producing messages into a Kafka topic (Topic-1).
  - In this case I would be generating numbers sequentially from 1 every second
- We would be creating stream processor which consumes these messages, transforms and writes data into (Topic-2)
  - I would be finding the square of the number only if the number is an even number. That is, when we receive numbers 1, 2, 3 – we would be finding the square of 2 only. We will skip 1 and 3.
- Consumers consume the messages from Topic-2
  - Consumers consume the numbers like 4, 16 etc (processed by the stream processors)
  
## Process to run the project

### Start Zookeeper
  - Open a command prompt and start the Zookeeper
    - .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
    
### Start Kafka
  - Open a new command prompt and start the Apache Kafka
    - .\bin\windows\kafka-server-start.bat .\config\server.properties
    
### Create Topic
  - Open a new command prompt and create two topics , that has only one partition & one replica
    - .\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic input-topic
    - .\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic square-topic
    - .\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic double-topic
    
### Start Projects
  - Start square-number-consumer project
  - Start double-number-consumer project
  - Start stream-processor project
  - Start number-producer project
  
### Check the console of each project to verify output
