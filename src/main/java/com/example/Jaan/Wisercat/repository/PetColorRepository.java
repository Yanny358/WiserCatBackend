package com.example.Jaan.Wisercat.repository;

import com.example.Jaan.Wisercat.entity.PetColor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetColorRepository extends JpaRepository<PetColor, Integer> {
}
