package com.example.Jaan.Wisercat.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component()
public class Mapper {
    public static ModelMapper getMapper() {
        return new ModelMapper();
    }
}
