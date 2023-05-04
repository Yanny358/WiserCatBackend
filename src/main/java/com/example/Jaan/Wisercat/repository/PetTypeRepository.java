package com.example.Jaan.Wisercat.repository;

import com.example.Jaan.Wisercat.entity.PetType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetTypeRepository extends JpaRepository<PetType, Integer> {
}
