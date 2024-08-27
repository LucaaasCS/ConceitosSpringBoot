package com.lucas.first_spring_app.controller;


import com.lucas.first_spring_app.domain.User;
import com.lucas.first_spring_app.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

   @Autowired
   private HelloWorldService helloWorldService;


    //GET /helloWorld
    @GetMapping
    public String helloWorld() {
        return helloWorldService.helloWorld("Lucas");
    }

    @PostMapping("{/id}")
    public String helloWorldPost(@PathVariable("id") String id,@RequestParam(value = "filter", defaultValue = "nenhum") String filter, @RequestBody User body) {
        return "Hello World " + filter;
    }
}
