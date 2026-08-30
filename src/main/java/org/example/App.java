package org.example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class App implements RequestHandler<Person, String> {

    public String handleRequest(final Person person, final Context context) {
        return person.getName()
                .map( name -> "Hello, " + name)
                .orElse("Hello, World!");
    }
}
