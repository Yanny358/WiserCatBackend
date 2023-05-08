package com.example.Jaan.Wisercat.mapper;
import com.example.Jaan.Wisercat.dto.PetDtoIn;
import com.example.Jaan.Wisercat.dto.PetDtoOut;
import com.example.Jaan.Wisercat.dto.UserDtoIn;
import com.example.Jaan.Wisercat.dto.UserDtoOut;
import com.example.Jaan.Wisercat.entity.Pet;
import com.example.Jaan.Wisercat.entity.User;
import org.mapstruct.*;

import java.util.List;

@org.mapstruct.Mapper(componentModel = "spring")
public interface Mapper {

    @Mapping(source = "petColor.color", target = "petColor")
    @Mapping(source = "petCountry.country", target = "petCountry")
    @Mapping(source = "petType.type", target = "petType")
    @Mapping(source = "petCountry.id", target = "petCountryId")
    @Mapping(source = "petType.id", target = "petTypeId")
    @Mapping(source = "petColor.id", target = "petColorId")
    @Mapping(source = "user.id", target = "userId")
    PetDtoOut entityToDto(Pet pet);

    List<PetDtoOut> entityToDtos(List<Pet> pets);

    @Mapping(source = "petColorId", target = "petColor.id")
    @Mapping(source = "petCountryId", target = "petCountry.id")
    @Mapping(source = "petTypeId", target = "petType.id")
    @Mapping(source = "userId", target = "user.id")
    Pet dtoToEntity(PetDtoIn petDtoIn);

    UserDtoOut toUserDtoOut(User user);
}
