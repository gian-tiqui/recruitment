package com.recruitment.recruitment.service.impl;

import com.recruitment.recruitment.dto.UserDto;
import com.recruitment.recruitment.entity.User;
import com.recruitment.recruitment.exception.ResourceNotFoundException;
import com.recruitment.recruitment.mapper.UserMapper;
import com.recruitment.recruitment.repository.UserRepo;
import com.recruitment.recruitment.service.UserService;

import java.util.List;
import java.util.stream.Collectors;

public class UserServiceImpl implements UserService {

    private UserRepo userRepo;

    @Override
    public UserDto createUser(UserDto userDto) {
        User user = UserMapper.mapToUser(userDto);

        User savedUser = userRepo.save(user);

        return UserMapper.mapToUserDto(savedUser);
    }

    @Override
    public UserDto getUserById(Long userId) {

        User foundUser = userRepo
                .findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User not found"));

        return UserMapper.mapToUserDto(foundUser);
    }

    @Override
    public UserDto editUser(Long userId, User updatedUser) {
        return null;
    }

    @Override
    public List<UserDto> getUsers() {
        List<User> userDtoList = userRepo.findAll();

        return userDtoList
                .stream()
                .map(UserMapper::mapToUserDto)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteUser(Long userId) {
        userRepo.deleteById(userId);
    }
}
