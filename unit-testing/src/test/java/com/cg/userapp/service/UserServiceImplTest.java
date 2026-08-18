package com.cg.userapp.service;

import com.cg.userapp.dto.UserReponse;
import com.cg.userapp.dto.UserRequest;
import com.cg.userapp.entity.User;
import com.cg.userapp.repo.UserRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {

    @Mock
    UserRepo userRepo;

    @InjectMocks
    UserServiceImpl userService;

    @Test
    void shouldReturnUserById() {

        // Arrange
        User user = User.builder().id(2L).email("rahul@gmail.com").build();
        when(userRepo.findById(2L)).thenReturn(Optional.of(user));

        // Act
        var userReponse = userService.getUserById(2L);

        // Assert
        assertEquals(2L,userReponse.id());
        assertEquals("rahul@gmail.com", userReponse.email());

        // Verify
        verify(userRepo).findById(2L);
    }

    @Test
    void shouldCreateUser(){
        // Arrange
        UserRequest userRequest= new UserRequest("rahul@gmail.com","rahul@123");

        User user = User.builder().id(1L).email("rahul@gmail.com").build();

        when(userRepo.save(any(User.class))).thenReturn(user);

        // Act
        var response = userService.createuser(userRequest);

        // Assert
        assertEquals(1L,response.id());
        assertEquals("rahul@gmail.com",response.email());

        // Verify
        verify(userRepo).save(any(User.class));

    }

    @Test
    void shouldThrowExceptionWhenUserNotFound(){
        // Arrange
        when(userRepo.findById(1L)).thenReturn(Optional.empty());

        // Assert
        assertThrows(RuntimeException.class, ()-> userService.getUserById(1L));

        // Verify
        verify(userRepo).findById(1L);
    }


    @Test
    void shouldReturnAllUsers(){
        //Arrange
        List<User> users= List.of(
                User.builder().id(1L).email("rahul@gmail.com").build(),
                User.builder().id(2L).email("test@gmail.com").build()
        );

        when(userRepo.findAll()).thenReturn(users);

        // Act
        var allUsers = userService.getAllUsers();

        // Assert
        assertNotNull(allUsers);
        assertEquals(2,allUsers.size());
        assertEquals("rahul@gmail.com",allUsers.get(0).email());
        assertEquals("test@gmail.com",allUsers.get(1).email());

        // Verify
        verify(userRepo).findAll();
    }

    @Test
    void ShouldDeleteUserById(){
        // Arrange
        User user = User.builder().id(1L).email("rahul@gmail.com").build();
        when(userRepo.findById(1L)).thenReturn(Optional.of(user));

        // Act
        userService.deleteUserById(1L);

        // Verify
        verify(userRepo).findById(1L);
        verify(userRepo).delete(user);
    }

    @Test
    void shouldThrowExceptionWhenDeletingUserByIdDoesNotExist(){
        // Arrange
        User user = User.builder().id(1L).email("rahul@gmail.com").build();
        when(userRepo.findById(1L)).thenReturn(Optional.empty());

        assertThrows(RuntimeException.class, () ->userService.deleteUserById(1L));

        verify(userRepo).findById(1L);

    }
}