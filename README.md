# spring-boot-microservices-docker-compose
Spring Boot Microservices with Docker compose , Eureka Server , Api Cloud Gateway , Bank Microservice.

This project is Spring Boot Microservice project with Docker Compose .
This project consist of following Microservices
1) eureka-server
2) api-cloud-gateway
3) bank-microservice
4) customer-microservice

How to run project :

** Clone project :
git clone https://github.com/sagaramelmatti/spring-boot-microservices-docker-compose.git

** Clean all project 
mvn clean install

**Run Docker Compose 
docker-compose up

---------------------------------------------------------------------------------------------
Check all images and containers:

docker images
docker ps -a

----------------------------------------------------------------------------------------------
Run Bank Database with compose :

Check Running DB Images using below command 

docker ps -a 

Login to databases using below :

docker exec -it spring-boot-microservices-docker-compose_bankdbimage_1 mysql -p




-------------------------------------------------------------------------------------------------
Run Customer Database with compose :

spring-boot-microservices-docker-compose_customerdbimage_1
mysql -uroot -root

------------------------------------------------------------------------------------------------

Run Application :

Run Bank Microservice :

1)  http://localhost:9191/banks/


Run Customer Microservice :

1)  http://localhost:9191/customers/



