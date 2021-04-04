# Resume-Generator

 Resume-generator is a java spring-boot and thyme-leaf based web application that allows you to create HTML resumes easily. The application allows you to choose from 3 different themes when creating/ editing a resume. 

## How to run the application

1. In order to get this application up and running quickly, you will need to have `java` & `docker` run-time installed on your computer. 
2. On a local computer where you have a docker runtime and java installed, clone this repository and go to `Deployment > target` folder. 
3. Now, run the following commands one by one in the given sequence:<br />
   a) `docker run --name mysql-standalone -p 6603:3306 -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=resume-portal -d mysql`<br />
   b) `java -jar resume-portal-1.0.0.jar`<br />
4. The application should be up and running on the following `URL: http://localhost:5000`


 ## How to use Resume-Generator

1. On the welcome screen, use the following credentials:<br />
    `user: newton`<br />
    `password: newton`<br />
2. Once, you are logged in you can change theme, update given information and then click submit button given at the bottom to save your changes.      
3. Clicking submit will generate a preview of your HTML resume.  

 ## User Stories

- Users can choose different themes, and create a beautiful resume quickly. 
- Deployment of the application is pretty quick due to all the dependencies packed in a single fat jar file as a spring boot application.  

 ## Features

 - Easy to understand code which is built following Spring MVC design pattern.
 - Simple and straightforward User Interface. 
 - Built in Spring Security and hibernate ORM which increases the potability of the application. 

 ## Future features

 - Make it more stable with higher quality to match a production grade application. 
 - Resolve obvious defects. 
 - Complete docker-compose file to further simplify the deployment of the application. 

 ## Dependencies 

 - Docker
 - Spring boot, Spring MVC, Spring Security, Spring ORM
 - MySQL, Hibernate
 - thymeleaf
 - Enterprise Java
 - JSP and Servlets

## What the app looks like

![screenshot1](https://raw.githubusercontent.com/Damans227/Resume-Generator/main/screenshots/resume-generator.gif)

