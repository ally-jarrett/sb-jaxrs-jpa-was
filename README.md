Spring Boot WAS Integration
===========================

Spring Boot with Spring Data JPA & Spring JAXRS, running as a WAR deployment on WAS 8.5.5.9 using JNDI Datasource & Spring Profiles for local & WAS deployed resources

## Usage ##

1. Install the WAR file on WAS
2. Specify a Context root of your choosing
3. Goto: 
PingService
- http://{hostname}:{port}/{contextRoot}/hello/
- http://{hostname}:{port}/{contextRoot}/hello/ping
- http://{hostname}:{port}/{contextRoot}/hello/sayHello/{name}

BookService (JPA)
- http://{hostname}:{port}/{contextRoot}/books/
- http://{hostname}:{port}/{contextRoot}/books/{id}
- http://{hostname}:{port}/{contextRoot}/books/search/name/{name}
- http://{hostname}:{port}/{contextRoot}/books/search/name/match/{name}
- http://{hostname}:{port}/{contextRoot}/books/search/param/{name}/{author}/{price}
- http://{hostname}:{port}/{contextRoot}/books/search/price/{price}
- http://{hostname}:{port}/{contextRoot}/books/search/price/{price1}/{price2}
- http://{hostname}:{port}/{contextRoot}/books/search/{name}/{author}
- http://{hostname}:{port}/{contextRoot}/books/add/{id}/{name}/{author}/{price}
- http://{hostname}:{port}/{contextRoot}/books/delete/{id}

## Versions ##

Spring Boot : 1.4.3-RELEASE
JPA : 2.0
Hibernate: 4.2.21

## Other Instructions ##

For WebSphere you will need to setup a H2 JNDI Datasource bound to: jdbc/myDataSource 
