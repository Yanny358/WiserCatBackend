package com.example.Jaan.Wisercat.repository;

import com.example.Jaan.Wisercat.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends JpaRepository<Pet, Integer> {
}
