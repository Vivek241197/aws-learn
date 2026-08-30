package org.example;

public class App  {

    public String handleRequest(final Person person) {
        return person.getName()
                .map( name -> "Hello, " + name)
                .orElse("Hello, World!");
    }
}
