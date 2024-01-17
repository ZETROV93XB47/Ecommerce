package com.example.ecommerce.EcommerceBackArtifact.Database.Converters;

import com.example.ecommerce.EcommerceBackArtifact.Model.enums.Role;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class RoleTypeConverter implements AttributeConverter<Role, Integer> {

    @Override
    public Integer convertToDatabaseColumn(Role role) {
        return role == null ? null : role.getCode();
    }

    @Override
    public Role convertToEntityAttribute(Integer role) {
        if (role == null) {
            return null;
        }

        return Role.getByCode(role);
    }
}
