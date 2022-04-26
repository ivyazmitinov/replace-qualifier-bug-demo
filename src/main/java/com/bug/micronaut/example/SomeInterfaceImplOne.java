package com.bug.micronaut.example;

import com.bug.micronaut.example.qualifiers.One;
import io.micronaut.context.annotation.Context;


@One
@Context
public class SomeInterfaceImplOne implements SomeInterface
{
    @Override
    public void doSomething()
    {

    }
}
