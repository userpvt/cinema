package com.cource.cinema.controller;

import com.cource.cinema.dto.UserDTO;
import com.cource.cinema.service.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserServiceImpl userService;

    // TODO just for test remove it
    @GetMapping("/{name}")
    public List<UserDTO> getUsersByName(@PathVariable String name) {
        return userService.findByName(name);
    }
}
