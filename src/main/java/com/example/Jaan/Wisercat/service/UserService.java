package com.example.Jaan.Wisercat.service;

import com.example.Jaan.Wisercat.dto.UserDtoIn;
import com.example.Jaan.Wisercat.dto.UserDtoOut;
import com.example.Jaan.Wisercat.entity.User;
import com.example.Jaan.Wisercat.mapper.Mapper;
import com.example.Jaan.Wisercat.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;

    private Mapper mapper;


    public User getValidUser(String username, String password) {
        Optional<User> userOptional = userRepository.findUserByUsernameAndPassword(username, password);
        return userOptional.orElseThrow();
    }

    public UserDtoOut login(UserDtoIn userDtoIn){
        User user = getValidUser(userDtoIn.getUsername(), userDtoIn.getPassword());
        return mapper.toUserDtoOut(user);
    }
}
