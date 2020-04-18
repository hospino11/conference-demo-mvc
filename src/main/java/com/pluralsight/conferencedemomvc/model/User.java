package com.pluralsight.conferencedemomvc.model;

import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.Value;

import javax.validation.constraints.NotBlank;

@Builder
@Value
@RequiredArgsConstructor
public class User {

    @NotBlank
    String firstName;
    @NotBlank
    String lastName;
    int age;
}