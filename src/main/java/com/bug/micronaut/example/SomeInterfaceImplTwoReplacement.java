package com.bug.micronaut.example;

import com.bug.micronaut.example.qualifiers.Two;
import io.micronaut.context.annotation.Context;
import io.micronaut.context.annotation.Replaces;

@Context
@Replaces(value = SomeInterface.class, qualifier = Two.class)
@Two
public class SomeInterfaceImplTwoReplacement implements SomeInterface
{
    @Override
    public void doSomething()
    {

    }
}
