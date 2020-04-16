package com.pluralsight.conferencedemomvc.model;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.Value;

import javax.validation.constraints.NotBlank;

@Builder
@Value
@RequiredArgsConstructor(access = AccessLevel.PUBLIC)
public class Registration {

    @NotBlank(message = "Name must not be blank")
    private final String name;

    @NotBlank(message = "Password must not be blank")
    private final String password;
}
