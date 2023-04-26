package com.example.Jaan.Wisercat.entity;

import com.example.Jaan.Wisercat.entity.petEnums.PetFurColor;
import com.example.Jaan.Wisercat.entity.petEnums.PetOriginCountry;
import com.example.Jaan.Wisercat.entity.petEnums.PetType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import jakarta.validation.constraints.NotNull;


@Entity
@Table(name = "pets")
@Getter
@Setter
public class Pet {

    @Id
    @GeneratedValue
    @Column
    private Integer id;

    @Column
    @NotNull
    private String name;

    @Column
    @NotNull
    private String code;

    @Column
    @Enumerated(EnumType.STRING)
    private PetType petType;

    @Column
    @Enumerated(EnumType.STRING)
    private PetFurColor petFurColor;

    @Column
    @Enumerated(EnumType.STRING)
    private PetOriginCountry petOriginCountry;
}
