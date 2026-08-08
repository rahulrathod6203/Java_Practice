package com.cg.userapp.service;

import com.cg.userapp.dto.UserReponse;
import com.cg.userapp.dto.UserRequest;
import com.cg.userapp.entity.User;

import java.util.List;

public interface UserService {

    List<UserReponse> getAllUsers();

    UserReponse createuser(UserRequest userRequest);

    UserReponse getUserById(Long id);

    void deleteUserById(Long id);

}
