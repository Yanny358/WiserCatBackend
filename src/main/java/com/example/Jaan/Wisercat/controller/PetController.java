package com.example.Jaan.Wisercat.controller;

import com.example.Jaan.Wisercat.dto.PetDto;
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
    public ResponseEntity<List<PetDto>> getPets() {
        return ResponseEntity.ok(petService.getPets());
    }

    @PostMapping(value = "savePet")
    public ResponseEntity<String> savePet(@RequestBody  @Valid PetDto petDto) {
        return ResponseEntity.ok(String.valueOf(petService.savePet(petDto)));
    }
}
