package com.cg.userapp.service;

import com.cg.userapp.dto.UserReponse;
import com.cg.userapp.dto.UserRequest;
import com.cg.userapp.entity.User;
import com.cg.userapp.mapper.UserMapper;
import com.cg.userapp.repo.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;

    @Override
    public List<UserReponse> getAllUsers() {
        List<UserReponse> users = userRepo.findAll().stream().map(UserMapper::toResponse).toList();
        return users;
    }

    @Override
    public UserReponse createuser(UserRequest userRequest) {
        User newUser = UserMapper.toEntity(userRequest);
        User savedUser = userRepo.save(newUser);
        return UserMapper.toResponse(savedUser);
    }

    @Override
    public UserReponse getUserById(Long id) {
        User user = userRepo.findById(id).orElseThrow(
                () -> new RuntimeException("User not found!"));
        return UserMapper.toResponse(user);
    }

    @Override
    public void deleteUserById(Long id) {
        User user = userRepo.findById(id).orElseThrow(
                () -> new RuntimeException("User not found!"));
        userRepo.delete(user);
    }
}
