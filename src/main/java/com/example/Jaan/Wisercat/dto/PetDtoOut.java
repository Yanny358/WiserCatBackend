package com.example.Jaan.Wisercat.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;

@Data
public class PetDtoOut implements Serializable {

    private  Integer id;
    @NotNull
    @Size(min = 2, max = 100)
    private  String name;

    @NotNull
    @Size(min = 1, max = 100)
    private  String code;

    private  Integer petColorId;
    private  String petColor;

    private  Integer petCountryId;
    private  String petCountry;

    private  Integer petTypeId;
    private  String petType;

}
