package com.cg.userapp.mapper;

import com.cg.userapp.dto.UserReponse;
import com.cg.userapp.dto.UserRequest;
import com.cg.userapp.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public static UserReponse toResponse(User user){
        return UserReponse.builder()
                .id(user.getId())
                .email(user.getEmail())
                .build();
    }

   public static User toEntity(UserRequest userRequest){
        return User.builder()
                .email(userRequest.email())
                .password(userRequest.password())
                .build();
    }
}
