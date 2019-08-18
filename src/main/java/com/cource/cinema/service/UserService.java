package com.cource.cinema.service;

import com.cource.cinema.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO save(UserDTO user);
    List<UserDTO> findByName(String name);
}
