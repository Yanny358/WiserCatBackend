package com.example.Jaan.Wisercat.service;

import com.example.Jaan.Wisercat.entity.PetColor;
import com.example.Jaan.Wisercat.entity.PetCountry;
import com.example.Jaan.Wisercat.entity.PetType;
import com.example.Jaan.Wisercat.repository.PetColorRepository;
import com.example.Jaan.Wisercat.repository.PetCountryRepository;
import com.example.Jaan.Wisercat.repository.PetTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetDropdownService {
    @Autowired
    private PetColorRepository petColorRepository;

    @Autowired
    private PetCountryRepository petCountryRepository;

    @Autowired
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
