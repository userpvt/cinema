package com.cource.cinema.security;

import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

@Getter
public class JwtUser extends User {
    private String firstName;
    private String lastName;

    public JwtUser(String username, String password, Collection<? extends GrantedAuthority> authorities, String firstName, String lastName) {
        super(username, password, authorities);

        this.firstName = firstName;
        this.lastName = lastName;
    }
}
