package com.cource.cinema.security;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class JwtAuthenticationResponse {

    @Getter
    private final String token;
}
