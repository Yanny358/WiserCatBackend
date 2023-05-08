package com.example.Jaan.Wisercat.service;

import com.example.Jaan.Wisercat.dto.UserDtoIn;
import com.example.Jaan.Wisercat.dto.UserDtoOut;
import com.example.Jaan.Wisercat.entity.User;
import com.example.Jaan.Wisercat.mapper.Mapper;
import com.example.Jaan.Wisercat.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private Mapper mapper;

    public void addUser(User user) {
       userRepository.save(user);
    }

    public User getValidUser(String username, String password) {
        Optional<User> userOptional = userRepository.findUserByUsernameAndPassword(username, password);
        return userOptional.orElseThrow();
    }

    public UserDtoOut login(UserDtoIn userDtoIn){
        User user = getValidUser(userDtoIn.getUsername(), userDtoIn.getPassword());
        return mapper.toUserDtoOut(user);
    }
}
