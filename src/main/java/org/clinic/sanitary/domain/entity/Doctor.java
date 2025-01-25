package org.clinic.sanitary.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "medicos")
public class Doctor extends User {
    @Enumerated(EnumType.STRING)
    @Column(name = "especialidad", nullable = false)
    private MedicalSpecialty specialty;
    @Column(name = "horario", nullable = false)
    private LocalDate shift;
    @Column(name = "salario", nullable = false)
    private BigDecimal salary;
}
