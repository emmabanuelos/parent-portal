package com.emmabanuelos.liftoffwebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping
    @ResponseBody
    public String hello() {
        return "Hello, World!";
    }

    @GetMapping("socialmedia")
    @ResponseBody
    public String socialmedia() {
        return "Follow me on Instagram @emmavsworld <3";
    }
}
