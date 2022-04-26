package com.bug.micronaut.example;

import com.bug.micronaut.example.qualifiers.One;
import io.micronaut.context.annotation.Context;

@Context
public class Service
{
    private final SomeInterface someInterface;

    public Service(@One SomeInterface someInterface)
    {
        this.someInterface = someInterface;
    }
}
