package com.recruitment.recruitment.service.impl;

import com.recruitment.recruitment.dto.UserDto;
import com.recruitment.recruitment.entity.User;
import com.recruitment.recruitment.repository.UserRepo;
import com.recruitment.recruitment.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserRepo userRepo;

    @Override
    public UserDto createUser(UserDto userDto) {
        return null;
    }

    @Override
    public UserDto getUserById(Long userId) {
        return null;
    }

    @Override
    public UserDto editUser(Long userId, User updatedUser) {
        return null;
    }

    @Override
    public List<UserDto> getUsers() {
        return List.of();
    }

    @Override
    public void deleteUser(Long userId) {

    }
}
