package org.example;

import org.example.ImmutableTestInterface;

public class ImmutableUser {

    public static void main(String[] args) {
        TestInterface foo = ImmutableTestInterface.builder().value("test").build();
    }

}
