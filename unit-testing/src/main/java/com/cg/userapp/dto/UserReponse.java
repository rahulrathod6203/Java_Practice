package com.cg.userapp.dto;

import lombok.Builder;

@Builder
public record UserReponse(
        Long id,
        String email
) {
}
