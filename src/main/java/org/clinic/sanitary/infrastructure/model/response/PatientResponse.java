package org.clinic.sanitary.infrastructure.model.response;

import lombok.Builder;

@Builder
public record PatientResponse(
        boolean code
) {
}
