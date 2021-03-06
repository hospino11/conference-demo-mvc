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
- Interceptor
    - SessionLocaleResolver: ties our current  session to a locale.
    - LocaleChangeInterceptor: looks for a parameter either through a hidden element in our url string as a query parameter.
- I18N
- Post-Redirect-Get (PRG)
- Validator
    - @Valid: javax.validation.Valid
    - @NotBlank: javax.validation.constraints.NotBlank
    - BindingResult: captures the validation errors
    - form:errors: adds the errors in the HTML page
    - JSR 303: was the original specification for bean validation. It works well for JSE 5. Bean validation spec 1.0
    - JSR 349: is targeted to JSE 7. It cleaned bean ambiguities with bean spec 1.0 and It's the bean validation spec 1.1
    - JSR 380: was released as of JSE 8 and focused in the modularity changes that were introduced on JSE 9. Bean validation spec 2.0
    - I18N validation error messages
- @RestController
- @PostMapping
- Calling RestController with JQuery
## About MVC
### View
View can access the model through a controller. View represents the model or desired data.

Views are resolved by a Controller building a model and it's passed to the View Resolver which then will determine the 
correct view that we want to display and choose the appropriate view based of that request.
### Controller
It interprets the user requests and selects the proper view based of the requested view or what information we get back from our data model.
### Model
Model is not talking about database or the framework used to access to the database. The real thing is regarding the information that we are going to represent in the view.
## Interceptor
### Overview
Interceptor are used to allows us to intercept calls to our server and perform special tasks on a call.
### Common uses
- Logging: we can change the log level on an application without having to redeploy it.
- Security
- I18N: internationalization of sites and catching their request to change locales.
- Performance monitoring: we can to intercept each call to perform some metric gathering on a request.
## PRG
Post-Redirect-Get pattern (PRG) is a technique used to help eliminate form re-submission.
The user post to the controller does whatever intended action was requested but before returning the view back to the user, 
it does an internal redirect and issues a get back to itself to display the page to the user.