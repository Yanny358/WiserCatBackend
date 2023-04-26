package com.example.Jaan.Wisercat.service;

import com.example.Jaan.Wisercat.dto.PetDto;
import com.example.Jaan.Wisercat.entity.Pet;
import com.example.Jaan.Wisercat.mapper.Mapper;
import com.example.Jaan.Wisercat.repository.PetRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {

    @Autowired
    private PetRepository petRepository;

    public List<PetDto> getPets() {
        ModelMapper modelMapper = Mapper.getMapper();
        return petRepository.findAll().stream().map(book -> modelMapper.map(book, PetDto.class)).toList();
    }

    public Integer savePet(PetDto petDto) {
        ModelMapper modelMapper = Mapper.getMapper();
        return petRepository.save(modelMapper.map(petDto, Pet.class)).getId();
    }
}
