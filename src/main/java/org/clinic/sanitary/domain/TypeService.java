package org.clinic.sanitary.domain;

import lombok.Getter;

@Getter
public enum TypeService {
    GENERAL_CONSULTATION(1, "Consulta General"),
    SPECIALIZED_CONSULTATION(2, "Consulta Especializada"),
    EXAM(3, "Examen Médico"),
    SURGERY(4, "Cirugía"),
    THERAPY(5, "Terapia y Tratamientos");

    private final int code;
    private final String spanishTranslation;

    TypeService(int code, String spanishTranslation) {
        this.code = code;
        this.spanishTranslation = spanishTranslation;
    }

    public static TypeService fromCode(int code) {
        for (TypeService type : TypeService.values()) {
            if (type.code == code) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid TypeService code: " + code);
    }
}
