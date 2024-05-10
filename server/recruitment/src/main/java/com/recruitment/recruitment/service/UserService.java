package com.recruitment.recruitment.service;

import com.recruitment.recruitment.dto.UserDto;

public interface UserService {
    UserDto createUser(UserDto userDto);
    UserDto getUserById(Long userId);

}
