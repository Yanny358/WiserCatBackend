package com.example.Jaan.Wisercat.controller;

import com.example.Jaan.Wisercat.dto.UserDtoIn;
import com.example.Jaan.Wisercat.dto.UserDtoOut;
import com.example.Jaan.Wisercat.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/user")
public class UserController {
    private final UserService userService;

    @PostMapping("login")
    public UserDtoOut login(@RequestBody UserDtoIn userDtoIn) {
        return userService.login(userDtoIn);
    }
}
