package com.bug.micronaut.example;

import com.bug.micronaut.example.qualifiers.Two;
import io.micronaut.context.annotation.Context;

@Two
@Context
public class SomeInterfaceImplTwo implements SomeInterface
{
    @Override
    public void doSomething()
    {

    }
}
