package com.example.ecommerce.EcommerceBackArtifact.Model.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import static java.util.Arrays.stream;

@Getter
@RequiredArgsConstructor
public enum Role {

    USER(1),
    ADMIN(2);
    private final Integer code;

    public static Role getByCode(Integer code) {
        return stream(values()).filter(role -> role.getCode() == code).findFirst().orElseThrow(IllegalArgumentException::new);
    }

}
