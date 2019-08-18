package com.cource.cinema.integration;

import com.cource.cinema.dto.UserDTO;
import com.cource.cinema.entity.User;
import com.cource.cinema.repository.UserRepository;
import com.cource.cinema.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;

    @Test
    public void testSaveUser() {
        UserDTO user = new UserDTO();
        String test_user_name = "test_surname@test.com";
        user.setUsername(test_user_name);
        user.setUsername("test_surname@test.com");

        UserDTO savedUser = userService.save(user);

        Optional<User> userResult = userRepository.findById(savedUser.getId());

        assertTrue(userResult.isPresent());
        assertEquals(test_user_name, userResult.get().getUsername());
    }

}