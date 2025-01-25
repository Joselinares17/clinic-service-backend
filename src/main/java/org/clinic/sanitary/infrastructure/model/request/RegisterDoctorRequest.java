package org.clinic.sanitary.infrastructure.model.request;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import org.clinic.sanitary.infrastructure.model.dto.UserInfoDTO;

public record RegisterDoctorRequest(
        @NotNull
        UserInfoRequest infoRequest,
        @NotNull
                @NotBlank
        String speciality,
        @NotNull
                @NotBlank
        String shift,
        @NotBlank
                @Positive
                @Digits(integer = 7, fraction = 2)
        String salary
) {
}
