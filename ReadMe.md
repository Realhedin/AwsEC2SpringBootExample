# Getting Started

##Usage
### Run application
Just to check, that application works,
you can build it with maven and start via jar file.
Or just run from IDE Simpleec2forwasApplication class.

### Deploy and run into AWS
Open AWS console and choose AWS Elastic beanstalk.
There you just need to choose Java environment and upload
jar file (build with maven)
After everything is done, open EC2 console
and use link from there.
(p.s. port: 5000 because Nginx proxy map it to this port in AWS by default)

### Run with docker
Application contains Dockerfile to be able to create an
image and run container via docker.
You can build your own image based on Dockerfile or 
just use already created: realhedin/simpleec2foraws
(docker run -dp 5000:5000 realhedin/simpleec2foraws
)


### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.2.1.RELEASE/maven-plugin/)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.2.1.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

