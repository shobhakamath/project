
# RabbitMQ 
- opensource message broker implemented using AMQP protocol
- AMQP stands for Advanced Messaging Queue Protocol
- helps decouple microservices using event
- Event driven architecture
    
# RabbitMQ installation using Docker 
rabbitMQ management installation -> dashboard
docker run -d --hostname my-rabbit --name my-rabbit  -p 15672:15672 -p 5672:5672 rabbitmq:3-management


http://localhost:15672/#/ 
username : guest
passowrd : guest

![Rabbit MQ](images/rabbit-mq.PNG?raw=true)

![Queue created programmatically](images/rabbit%20queue%20created.PNG?raw=true)