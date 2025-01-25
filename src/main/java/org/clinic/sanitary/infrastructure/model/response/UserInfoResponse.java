package org.clinic.sanitary.infrastructure.model.response;

import lombok.Builder;

import java.time.LocalDate;

@Builder
public record UserInfoResponse(
        Long id,
        String name,
        String lastname,
        String dni,
        LocalDate birthday,
        String email,
        String phone,
        String address
) {
}
