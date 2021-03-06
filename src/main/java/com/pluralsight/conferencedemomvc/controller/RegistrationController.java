package com.pluralsight.conferencedemomvc.controller;

import com.pluralsight.conferencedemomvc.model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class RegistrationController {

    private static final Logger log = Logger.getLogger(RegistrationController.class.getName());

    @GetMapping("registration")
    public String getRegistration(@ModelAttribute(name = "registration")Registration registration) {
        return "registration";
    }

    @PostMapping("registration")
    public String addRegistration(@Valid @ModelAttribute(name = "registration")Registration registration, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "registration";
        }
        log.log(Level.INFO, "Registration: " + registration.getName());
        return "redirect:registration";
    }
}
