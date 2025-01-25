package org.clinic.sanitary.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "paquete_servicio")
public class PackageService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "paquete_servicio_id")
    private Long id;
    @Column(name = "precio_paquete", nullable = false)
    private BigDecimal packagePrice;

    @ManyToOne
    @JoinColumn(name = "paquete_id", nullable = false)
    private Package aPackage;

    @ManyToOne
    @JoinColumn(name = "servicio_id", nullable = false)
    private Service service;
}
