package com.example.Jaan.Wisercat.repository;

import com.example.Jaan.Wisercat.entity.Pet;
import com.example.Jaan.Wisercat.entity.PetColor;
import com.example.Jaan.Wisercat.entity.PetCountry;
import com.example.Jaan.Wisercat.entity.PetType;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PetRepository extends JpaRepository<Pet, Integer> {
    @Transactional
    @Modifying
    @Query("update Pet p set p.name = ?1, p.petColor = ?2, p.petCountry = ?3, p.petType = ?4 where p.code = ?5")
    void updatePetByCode(String name, PetColor petColor, PetCountry petCountry, PetType petType, String code);

    //@Query("select p from Pet p where p.code = ?1")
    Pet findPetByCode(String code);

    //@Query("select p from Pet p where p.user.id = ?1")
    List<Pet> findByUserId(Integer id);

}
