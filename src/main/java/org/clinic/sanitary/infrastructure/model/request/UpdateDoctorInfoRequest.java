package org.clinic.sanitary.infrastructure.model.request;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Positive;
import org.hibernate.validator.constraints.Length;

import java.math.BigDecimal;

public record UpdateDoctorInfoRequest(
        @Email(message = "Email debe tener un formato válido.")
        String email,
        @Positive(message = "Teléfono debe ser positivo.")
                @Length(message = "Teléfono debe tener una longitud de 9 carácteres.")
        String phone,
        String address,
        //TODO: Agregar un decorador especialidades disponibles.
        String specialty,
        @Past
        String shift,
        @Digits(integer = 7, fraction = 2)
        BigDecimal salary
) {
}
