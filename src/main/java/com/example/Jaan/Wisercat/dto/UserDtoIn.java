package com.example.Jaan.Wisercat.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class UserDtoIn implements Serializable {

    @NotNull
    private String username;

    @NotNull
    private String password;
}
