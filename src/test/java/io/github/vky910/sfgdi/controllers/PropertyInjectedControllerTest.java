package io.github.vky910.sfgdi.controllers;

import io.github.vky910.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {
    //demo to show manual property injection
    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController(); //creating our own object (mimicking what spring would do for us)
        controller.greetingService = new ConstructorGreetingService();
    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());
    }

    @Test
    void getGreeting2() {

        System.out.println("Again: " + controller.getGreeting());
    }
}