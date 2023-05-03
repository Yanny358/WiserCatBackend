package com.example.Jaan.Wisercat.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "countries")
@Getter
@Setter
public class PetCountry {

    @Id
    @GeneratedValue
    @Column
    private Integer id;

    @NotNull
    @Column
    private String country;
}
