package org.example;

import org.apache.commons.text.RandomStringGenerator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from submodule1!");

        var randomStringGenerator = RandomStringGenerator.builder().get();
        System.out.println("A random string: " + randomStringGenerator.generate(10));
    }
}