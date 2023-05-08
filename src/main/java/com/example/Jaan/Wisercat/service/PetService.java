package com.example.Jaan.Wisercat.service;

import com.example.Jaan.Wisercat.dto.PetDtoIn;
import com.example.Jaan.Wisercat.dto.PetDtoOut;
import com.example.Jaan.Wisercat.entity.Pet;
import com.example.Jaan.Wisercat.mapper.Mapper;
import com.example.Jaan.Wisercat.repository.PetRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {

    @Autowired
    private PetRepository petRepository;

    @Autowired
    private Mapper mapper;

    public List<PetDtoOut> getPets() {
        List<Pet> pet = petRepository.findAll();
       return mapper.entityToDtos(pet);
    }

    public void savePet(PetDtoIn petDtoIn) {
        Pet pet = mapper.dtoToEntity(petDtoIn);
        petRepository.save(pet);
    }

    public void updatePet(PetDtoIn petDtoIn){
        Pet pet = mapper.dtoToEntity(petDtoIn);
        petRepository.updatePetByCode(pet.getName(),
                pet.getPetColor(),
                pet.getPetCountry(),
                pet.getPetType(),
                pet.getCode());
    }

    public PetDtoOut getSinglePet(String petCode) {
        Pet pet =  petRepository.findPetByCode(petCode);
        return mapper.entityToDto(pet);
    }

    public List<PetDtoOut> getUserPets(Integer userId) {
        List<Pet> pet = petRepository.findByUserId(userId);
        return mapper.entityToDtos(pet);
    }
}
