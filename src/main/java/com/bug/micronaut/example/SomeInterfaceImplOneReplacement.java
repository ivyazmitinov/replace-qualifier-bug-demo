package com.bug.micronaut.example;

import com.bug.micronaut.example.qualifiers.One;
import io.micronaut.context.annotation.Context;
import io.micronaut.context.annotation.Replaces;

@Context
@Replaces(value = SomeInterface.class, qualifier = One.class)
public class SomeInterfaceImplOneReplacement implements SomeInterface
{
    @Override
    public void doSomething()
    {

    }
}
