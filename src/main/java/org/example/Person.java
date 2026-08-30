package org.example;

import java.util.Optional;

public class Person {

    int age;
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }
}
