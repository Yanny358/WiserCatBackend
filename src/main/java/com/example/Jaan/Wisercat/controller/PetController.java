package com.example.Jaan.Wisercat.controller;

import com.example.Jaan.Wisercat.dto.PetDtoIn;
import com.example.Jaan.Wisercat.dto.PetDtoOut;
import com.example.Jaan.Wisercat.service.PetService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pet")
@AllArgsConstructor
public class PetController {

    private final PetService petService;

    @GetMapping(value = "getPets")
    public ResponseEntity<List<PetDtoOut>> getPets() {
        return ResponseEntity.ok(petService.getPets());
    }

    @PostMapping(value = "savePet")
    public void savePet(@RequestBody  @Valid PetDtoIn petDtoIn) {
        petService.savePet(petDtoIn);
    }
    @PutMapping(value = "updatePet")
    public void updatePet(@RequestBody PetDtoIn petDtoIn){
        petService.updatePet(petDtoIn);
    }
    @GetMapping(value = "singlePet")
    public PetDtoOut getSinglePet(@RequestParam String petCode){
        return petService.getSinglePet(petCode);
    }
    @GetMapping(value = "userPet")
    public List<PetDtoOut> getUserPets(@RequestParam Integer userId){
        return petService.getUserPets(userId);
    }
}
