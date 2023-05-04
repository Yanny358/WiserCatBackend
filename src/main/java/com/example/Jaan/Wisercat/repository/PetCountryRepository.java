package com.example.Jaan.Wisercat.repository;

import com.example.Jaan.Wisercat.entity.PetCountry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetCountryRepository extends JpaRepository<PetCountry, Integer> {
}
