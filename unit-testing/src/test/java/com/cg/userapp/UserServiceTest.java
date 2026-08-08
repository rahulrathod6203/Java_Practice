package com.cg.userapp;


import com.cg.userapp.dto.UserReponse;
import com.cg.userapp.dto.UserRequest;
import com.cg.userapp.entity.User;
import com.cg.userapp.repo.UserRepo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.cg.userapp.service.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UserRepo userRepo;

    @InjectMocks
    private UserServiceImpl userServiceImpl;

    @Test
    void shouldCreateUserSuccessfully() {

        // Arrange
        UserRequest request = new UserRequest("rahul@gmail.com", "rahul@123");

        User savedUser = new User();
        savedUser.setId(1L);
        savedUser.setEmail("rahul@gmail.com");
        savedUser.setPassword("rahul@123");

        when(userRepo.save(any(User.class))).thenReturn(savedUser);

        // Act
        UserReponse response = userServiceImpl.createuser(request);

        // Assert
        assertNotNull(response);
        assertEquals("rahul@gmail.com", response.email());

        verify(userRepo).save(any(User.class));
    }
}
