# webshop-microservice


## Project overview 



## Tech stack 
+ Eureka server 
+ Spring cloud config server
+ Circuit breaker Hystrix 
+ Client-side load balancing: Ribbon 
+ Dynamic scaling: Eureka naming server 
+ API gateway Zuul 
+ RESTful service 
    + Hateoas
    + Exception handling
    + RESTtemplate
    + Feign client 
    + JPA 
    + Caching: Spring caching 
    + i18n
    + Bean Validation API  - Hibernate validator 
    + Unit test: rest controller, service, model, validation , 
    + Spring security : OAuth
+ Messaging : RabbitMQ

+ Database : MySQL, PostgreSQL, MongoDB, Cassandra
+ Build tool: Maven, Gradle 
+ Testing: JUnit, Mockito, Hamcrest
+ Hystrix dashboard 
+ API documentation : Swagger , SwaggerUI 
    + `http://localhost:8080/swagger-ui.html`

+ Zookeeper


## How to run 
+ Build 
    + Build with Gradle : `gradle bootRepackage`
    + Build with Maven : `mvn clean package`

+ Run 
    + 


+ Test 







* sudo apt-get install docker.io
* sudo mvn -e package docker:build
* sudo docker run --name dbCustomer -d cassandra:2.2.5
* sudo docker run -it --link dbCustomer:cassandra --rm cassandra:2.2.5 cqlsh cassandra
* sudo docker pull rabbitmq
* sudo docker run -d --hostname my-rabbit --name some-rabbit rabbitmq:3
* sudo docker run -p 8080:8080 -e SPRING_RABBITMQ_HOST=**rabbit docker ip** --link dbCustomer:cassandra -t customer-microservice/customer
* sudo docker run -p 8082:8082 -e SPRING_RABBITMQ_HOST=**rabbit docker ip** -t email-microservice/email
* sudo docker run -p 8081:8081 -t product-microservice/products
* sudo docker run -p 8086:8086 -t gateway-microservice/gateway
* sudo docker run -p 8084:8084 -t inventory-microservice/inventory
* sudo docker ps
* sudo docker inspect **containerId**
* sudo docker network inspect bridge





### Microservice 
+ Users - service
    + Spring security is enabled 
    + Postman: Authorization : type: Basic Auth - Username: user - Password : password 

+ Customer - service 


