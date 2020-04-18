package com.pluralsight.conferencedemomvc.controller;

import com.pluralsight.conferencedemomvc.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class UserController {

    private static final Logger log = Logger.getAnonymousLogger();

    @GetMapping("user")
    public User getUser(@RequestParam(defaultValue = "Hansel") String firstName, @RequestParam(defaultValue = "Ospino") String lastName, @RequestParam(defaultValue = "30") int age) {
        return User.builder()
                .firstName(firstName)
                .lastName(lastName)
                .age(age)
                .build();
    }

    @PostMapping("user")
    public User postUser(@Valid User userTemp) {
        log.log(Level.INFO, userTemp.toString());
        return userTemp;
    }
}
