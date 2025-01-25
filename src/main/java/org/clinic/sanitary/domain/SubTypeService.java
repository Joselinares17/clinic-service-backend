package org.clinic.sanitary.domain;

import lombok.Getter;

@Getter
public enum SubTypeService {
    // Subtypes for SPECIALIZED_CONSULTATION
    CARDIOLOGY(101, "Cardiología"),
    DERMATOLOGY(102, "Dermatología"),
    PEDIATRICS(103, "Pediatría"),
    GASTROENTEROLOGY(104, "Gastroenterología"),
    NEUROLOGY(105, "Neurología"),
    GYNECOLOGY(106, "Ginecología"),

    // Subtypes for EXAM
    BLOOD_TEST(201, "Análisis de Sangre"),
    X_RAY(202, "Radiografía"),
    ULTRASOUND(203, "Ecografía"),
    CT_SCAN(204, "Tomografía"),
    MRI(205, "Resonancia Magnética"),

    // Subtypes for THERAPY
    PHYSIOTHERAPY(301, "Fisioterapia"),
    REHABILITATION(302, "Rehabilitación"),
    OCCUPATIONAL_THERAPY(303, "Terapia Ocupacional"),
    PSYCHIATRIC_THERAPY(304, "Terapia Psiquiátrica"),

    // Subtypes for SURGERY
    MINOR_SURGERY(401, "Cirugía Menor"),
    MAJOR_SURGERY(402, "Cirugía Mayor"),
    LAPAROSCOPIC_SURGERY(403, "Cirugía Laparoscópica"),
    COSMETIC_SURGERY(404, "Cirugía Estética"),

    // Generic option for unclassified services
    GENERIC(999, "Genérico");

    private final int code;
    private final String spanishTranslation;

    SubTypeService(int code, String spanishTranslation) {
        this.code = code;
        this.spanishTranslation = spanishTranslation;
    }

    public static SubTypeService fromCode(int code) {
        for (SubTypeService subtype : SubTypeService.values()) {
            if (subtype.code == code) {
                return subtype;
            }
        }
        throw new IllegalArgumentException("Invalid SubTypeService code: " + code);
    }
}
