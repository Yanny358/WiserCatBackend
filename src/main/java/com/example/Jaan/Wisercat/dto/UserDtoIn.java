package com.example.Jaan.Wisercat.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;

@Data
public class UserDtoIn implements Serializable {

    @NotNull
    private String username;

    @NotNull
    private String password;
}
