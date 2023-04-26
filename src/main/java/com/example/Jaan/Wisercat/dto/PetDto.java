package com.example.Jaan.Wisercat.dto;

import com.example.Jaan.Wisercat.entity.petEnums.PetFurColor;
import com.example.Jaan.Wisercat.entity.petEnums.PetOriginCountry;
import com.example.Jaan.Wisercat.entity.petEnums.PetType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PetDto {

    private Integer id;

    @NotNull
    @Size(min = 2, max = 100)
    private String name;

    @NotNull
    @Size(min = 1)
    private String code;

    private PetType petType;

    private PetFurColor petFurColor;

    private PetOriginCountry petOriginCountry;
}
