package com.example.Jaan.Wisercat.controller;

import com.example.Jaan.Wisercat.entity.PetColor;
import com.example.Jaan.Wisercat.entity.PetCountry;
import com.example.Jaan.Wisercat.entity.PetType;
import com.example.Jaan.Wisercat.service.PetDropdownService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/pet")
public class PetDropdownController {
    
    private final PetDropdownService petDropdownService;

    @GetMapping(value = "getColors")
    public List<PetColor> getColors() {
        return petDropdownService.getAllColors();
    }

    @GetMapping(value = "getCountries")
    public List<PetCountry> getCountries() {
        return petDropdownService.getAllCountries();
    }

    @GetMapping(value = "getTypes")
    public List<PetType> getTypes() {
        return petDropdownService.getAllTypes();
    }

}
