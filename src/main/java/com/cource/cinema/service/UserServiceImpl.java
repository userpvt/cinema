package com.cource.cinema.service;


import com.cource.cinema.dto.UserDTO;
import com.cource.cinema.entity.User;
import com.cource.cinema.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository repository;
    private final ModelMapper modelMapper;

    @Override
    public UserDTO save(UserDTO user) {
        User savedUser = repository.save(convertUserDTOToUser(user));
        return convertUserToDTO(savedUser);
    }

    @Override
    public List<UserDTO> findByName(String name) {
        List<User> users = repository.findByFirstName(name);

        return users.stream()
                .map(this::convertUserToDTO)
                .collect(toList());
    }

    private UserDTO convertUserToDTO(User user) {
        return modelMapper.map(user, UserDTO.class);
    }

    private User convertUserDTOToUser(UserDTO userDTO) {
        return modelMapper.map(userDTO, User.class);
    }
}
