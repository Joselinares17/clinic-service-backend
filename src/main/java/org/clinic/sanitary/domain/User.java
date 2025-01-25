package org.clinic.sanitary.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usuarios")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuario_id")
    private Long id;
    @Column(name = "nombre", nullable = false)
    private String name;
    @Column(name = "apellido", nullable = false)
    private String lastname;
    @Column(nullable = false, unique = true)
    private String dni;
    @Column(name = "fecha_nacimiento", nullable = false)
    private LocalDate birthday;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(name = "teléfono", nullable = false)
    private String phone;
    @Column(name = "dirección", nullable = false)
    private String address;
}
