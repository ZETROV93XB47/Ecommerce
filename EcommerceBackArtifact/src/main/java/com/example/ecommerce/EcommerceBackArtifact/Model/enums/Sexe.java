package com.example.ecommerce.EcommerceBackArtifact.Model.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import static java.util.Arrays.stream;

@Getter
@RequiredArgsConstructor
public enum Sexe {
    M(1),
    F(2);
    private final Integer code;

    public static Sexe getByCode(int code) {
        return stream(values()).filter(sexe -> sexe.getCode() == code).findFirst().orElseThrow(IllegalArgumentException::new);
    }
}
