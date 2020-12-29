package io.github.vky910.sfgdi.controllers;

import io.github.vky910.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    //most preferred method for injecting dependency - Constructor Injected

    //best practice for Constructor based Dependency Injection -> use private final for the property
    private final GreetingService greetingService;

    //the @autowired annotation is optional on the constructor when we inject using constructor, we can omit it here.
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
