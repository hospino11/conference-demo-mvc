package com.pluralsight.conferencedemomvc.model;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.Value;

@Builder
@Value
@RequiredArgsConstructor(access = AccessLevel.PUBLIC)
public class Registration {

    private final String name;
}
