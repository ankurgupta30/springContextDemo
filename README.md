Spring IOC

Check the minimal dependency required for a Spring Project

Whats inside

Tried to use spring-context as the only dependency and do IOC, most basic spring. Minimal dependency required is spring-context without which you can not do dependency injection hence i believe that is the least you need to work on a spring project. Spring-context automatucally includes some transitive dependencises like

spring-core
spring-aop
spring-beans
spring-jcl
spring-expressions

Need to check:

Create a sample app using one of the above dependency to see if we can have a spring project with just spring-core or spring-beans etc.


