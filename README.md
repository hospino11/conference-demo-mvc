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
- InternalResourceViewResolver
- WebMvcConfigurer.addResourceHandlers
    - addResourceHandler: it states the desired URL to expose the static resources.-
    - addResourceLocations: it links the locations to be expose through the given resource handler.  
## About MVC
### View
View can access the model through a controller. View represents the model or desired data.

Views are resolved by a Controller building a model and it's passed to the View Resolver which then will determine the 
correct view that we want to display and choose the appropriate view based of that request.
### Controller
It interprets the user requests and selects the proper view based of the requested view or what information we get back from our data model.
### Model
Model is not talking about database or the framework used to access to the database. The real thing is regarding the information that we are going to represent in the view.