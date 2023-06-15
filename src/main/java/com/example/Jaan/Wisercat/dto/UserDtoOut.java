package com.example.Jaan.Wisercat.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;
@Data
public class UserDtoOut implements Serializable {

    private Integer id;

    @NotNull
    private String username;
}
