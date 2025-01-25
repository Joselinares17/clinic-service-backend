package org.clinic.sanitary.domain.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "servicios")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "servicio_id")
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String name;
    @Enumerated(EnumType.STRING)
    @Column(name = "tipo", nullable = false)
    private TypeService typeService;
    @Enumerated(EnumType.STRING)
    @Column(name = "subtipo", nullable = false)
    private SubTypeService subTypeService;
    @Column(name = "descripcion", nullable = false)
    private String description;

    @OneToMany(mappedBy = "service", cascade = CascadeType.ALL)
    private List<PackageService> packages;
}
