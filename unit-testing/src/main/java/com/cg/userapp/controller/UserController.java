package com.cg.userapp.controller;

import com.cg.userapp.dto.UserReponse;
import com.cg.userapp.dto.UserRequest;
import com.cg.userapp.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    @GetMapping
    public ResponseEntity<?> getAllUsers() {
        List<UserReponse> allUsers = userService.getAllUsers();
        if (allUsers.isEmpty()) {
            return new ResponseEntity<String>("No users found!", HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(allUsers);
    }

    @PostMapping
    public ResponseEntity<UserReponse> createuser(@RequestBody UserRequest userRequest) {
        UserReponse reponse = userService.createuser(userRequest);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(reponse.id())
                .toUri();
        return ResponseEntity.created(location).body(reponse);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserReponse> getUserById(@PathVariable Long id) {
        return ResponseEntity.ok(userService.getUserById(id));
    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable Long id) {
        userService.deleteUserById(id);
    }
}
