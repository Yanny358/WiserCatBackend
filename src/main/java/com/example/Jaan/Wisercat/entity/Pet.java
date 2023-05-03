package com.example.Jaan.Wisercat.entity;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column
    @NotNull
    private String name;

    @Column
    @NotNull
    private String code;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "colors_id")
    private PetColor petColor;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "types_id")
    private PetType petType;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "countries_id")
    private PetCountry petCountry;
}
