package com.pluralsight.conferencedemomvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class GreetingController {

    @GetMapping("greeting")
    public String greeting(Map<String, String> model) {
        model.put("message", "Hello Hansel");
        return "greeting";
    }
}
