package com.bug.micronaut.example;

import io.micronaut.context.ApplicationContext;
import io.micronaut.runtime.Micronaut;

public class Application {

    public static void main(String[] args) {
        final var applicationContext = Micronaut.run(Application.class, args);
    }
}
