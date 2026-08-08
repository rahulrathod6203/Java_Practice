package com.cg.userapp.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "user_info")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;
}
