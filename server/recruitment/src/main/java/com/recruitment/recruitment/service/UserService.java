package com.recruitment.recruitment.service;

import com.recruitment.recruitment.dto.UserDto;
import com.recruitment.recruitment.entity.User;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto userDto);
    UserDto getUserById(Long userId);
    UserDto editUser(Long userId, User updatedUser);
    List<UserDto> getUsers();
    void deleteUser(Long userId);
}
