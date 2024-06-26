package com.recruitment.recruitment.controller;

import com.recruitment.recruitment.dto.UserDto;
import com.recruitment.recruitment.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private UserService userService;

    @PostMapping
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto) {

        UserDto savedUser = userService.createUser(userDto);

        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable("id") Long userId) {

        UserDto foundUser = userService.getUserById(userId);

        return ResponseEntity.ok(foundUser);
    }

    @GetMapping
    public ResponseEntity<List<UserDto>> getUsers() {

        List<UserDto> userDtoList = userService.getUsers();

        return ResponseEntity.ok(userDtoList);
    }
}
