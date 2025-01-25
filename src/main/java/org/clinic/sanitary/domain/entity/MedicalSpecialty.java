package org.clinic.sanitary.domain.entity;

import lombok.Getter;

@Getter
public enum MedicalSpecialty {
    // Internal Medicine Specialties
    CARDIOLOGY(101, "Cardiología"),
    ENDOCRINOLOGY(102, "Endocrinología"),
    GASTROENTEROLOGY(103, "Gastroenterología"),
    HEMATOLOGY(104, "Hematología"),
    NEPHROLOGY(105, "Nefrología"),
    PULMONOLOGY(106, "Neumología"),

    // Surgical Specialties
    GENERAL_SURGERY(201, "Cirugía General"),
    NEUROSURGERY(202, "Neurocirugía"),
    ORTHOPEDIC_SURGERY(203, "Cirugía Ortopédica"),
    PLASTIC_SURGERY(204, "Cirugía Plástica"),
    PEDIATRIC_SURGERY(205, "Cirugía Pediátrica"),

    // Pediatrics Specialties
    PEDIATRICS_GENERAL(301, "Pediatría General"),
    PEDIATRIC_CARDIOLOGY(302, "Cardiología Pediátrica"),
    NEONATOLOGY(303, "Neonatología"),

    // Gynecology and Obstetrics
    GYNECOLOGY(401, "Ginecología"),
    OBSTETRICS(402, "Obstetricia"),

    // Other Specialties
    DERMATOLOGY(501, "Dermatología"),
    NEUROLOGY(502, "Neurología"),
    PSYCHIATRY(503, "Psiquiatría"),
    OPHTHALMOLOGY(504, "Oftalmología"),
    OTORHINOLARYNGOLOGY(505, "Otorrinolaringología"),

    // Generic option for unclassified specialties
    GENERIC(999, "Genérico");

    private final int code;
    private final String spanishTranslation;

    MedicalSpecialty(int code, String spanishTranslation) {
        this.code = code;
        this.spanishTranslation = spanishTranslation;
    }

    public static MedicalSpecialty fromCode(int code) {
        for (MedicalSpecialty specialty : MedicalSpecialty.values()) {
            if (specialty.code == code) {
                return specialty;
            }
        }
        throw new IllegalArgumentException("Invalid MedicalSpecialty code: " + code);
    }
}
