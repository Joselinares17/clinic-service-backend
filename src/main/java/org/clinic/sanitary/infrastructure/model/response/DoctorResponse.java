package org.clinic.sanitary.infrastructure.model.response;

import lombok.Builder;

import java.math.BigDecimal;
import java.time.LocalDate;

@Builder
public record DoctorResponse(
        String speciality,
        LocalDate shift,
        BigDecimal salary
) {
}
