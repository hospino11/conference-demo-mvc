# conference-demo-mvc
Spring Framework: Spring MVC Fundamentals
## Topics covered
- JAR to WAR
- MVC Configuration
    - SpringBootServletInitializer
    - spring.mvc.view.prefix=/WEB-INF/jsp/
    - spring.mvc.view.suffix=.jsp
- @Controller
- @GetMapping
- Update model
    - Map<String, String> model
- @ModelAttribute
- @PostMapping
## About MVC
### View
View can access the model through a controller. View represents the model or desired data.
### Controller
It interprets the user requests and selects the proper view based of the requested view or what information we get back from our data model.
### Model
Model is not talking about database or the framework used to access to the database. The real thing is regarding the information that we are going to represent in the view.