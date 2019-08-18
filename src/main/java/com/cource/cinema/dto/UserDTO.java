package com.cource.cinema.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class UserDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String username;

    @Setter(onMethod_ = { @JsonProperty })
    @Getter(onMethod_ = { @JsonIgnore })
    private String password;
}
