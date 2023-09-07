/*package com.amigoscode.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControllerHello {

    @GetMapping("/greet")
    public GreetResponse greet(){
        GreetResponse response = new GreetResponse("Hello",
                List.of("Java", "Golang", "Javascript"),
                new Person("Alex"));

        return response;
    }
    record Person(String name){}

    record GreetResponse(String greet, List<String> favProgrammingLanguage, Person person){}
}
*/