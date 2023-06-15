package com.example.Jaan.Wisercat.service;

import com.example.Jaan.Wisercat.entity.PetColor;
import com.example.Jaan.Wisercat.entity.PetCountry;
import com.example.Jaan.Wisercat.entity.PetType;
import com.example.Jaan.Wisercat.repository.PetColorRepository;
import com.example.Jaan.Wisercat.repository.PetCountryRepository;
import com.example.Jaan.Wisercat.repository.PetTypeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PetDropdownService {
    
    private PetColorRepository petColorRepository;
    
    private PetCountryRepository petCountryRepository;
    
    private PetTypeRepository petTypeRepository;

    public List<PetColor> getAllColors() {
        return petColorRepository.findAll();
    }

    public List<PetCountry> getAllCountries() {
        return petCountryRepository.findAll();
    }

    public List<PetType> getAllTypes() {
        return petTypeRepository.findAll();
    }
}
