package org.clinic.sanitary.infrastructure.model.request;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDate;

public record UserInfoRequest(
        @NotBlank(message = "El campo nombre es requerido.")
                @Size(min = 2, max = 25, message = "Nombre debe tener una longitud de 2 a 25 carácteres.")
        String name,
        @NotBlank(message = "El campo apellido es requerido.")
                @Size(min = 2, max = 25, message = "Apellido debe tener una longitud de 2 a 25 carácteres.")
        String lastname,
        @NotBlank(message = "El campo dni es requerido.")
                @Digits(integer = 8, fraction = 0, message = "El campo dni debe tener 8 dígitos.")
        String dni,
        @NotBlank(message = "El campo fecha de cumpleaños es requerido.")
                @Past(message = "La fecha ingresada no es válida")
        LocalDate birthday,
        @NotBlank(message = "El campo email es requerido.")
                @Email(message = "Email debe tener un formato válido.")
        String email,
        @NotBlank(message = "El campo teléfono es requerido.")
                @Positive(message = "Teléfono debe ser positivo.")
                @Length(message = "Teléfono debe tener una longitud de 9 carácteres.")
        String phone,
        @NotBlank(message = "El campo dirección es requerido.")
        String address
) {
}
