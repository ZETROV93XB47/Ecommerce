package com.example.ecommerce.EcommerceBackArtifact.Database.Converters;

import com.example.ecommerce.EcommerceBackArtifact.Constants.Sexe;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class SexTypeConverter implements AttributeConverter<Sexe, Integer> {

    @Override
    public Integer convertToDatabaseColumn(Sexe sex) {
        return sex == null ? null : sex.getCode();
    }

    @Override
    public Sexe convertToEntityAttribute(Integer code) {
        if (code == null) {
            return null;
        }

        return Sexe.getByCode(code);
    }

}
