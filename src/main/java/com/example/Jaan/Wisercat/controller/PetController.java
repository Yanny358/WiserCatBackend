package com.example.Jaan.Wisercat.controller;

import com.example.Jaan.Wisercat.dto.PetDtoIn;
import com.example.Jaan.Wisercat.dto.PetDtoOut;
import com.example.Jaan.Wisercat.service.PetService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pet")
public class PetController {

    @Autowired
    private PetService petService;

    @GetMapping(value = "getPets")
    public ResponseEntity<List<PetDtoOut>> getPets() {
        return ResponseEntity.ok(petService.getPets());
    }

    @PostMapping(value = "savePet")
    public void savePet(@RequestBody  @Valid PetDtoIn petDtoIn) {
        petService.savePet(petDtoIn);
    }
}
