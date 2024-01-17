package com.example.ecommerce.EcommerceBackArtifact.Database.Converters;

import com.example.ecommerce.EcommerceBackArtifact.Model.enums.Marque;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class MarqueTypeConverter implements AttributeConverter<Marque, Integer> {

    @Override
    public Integer convertToDatabaseColumn(Marque marque) {
        return marque == null ? null : marque.getCode();
    }

    @Override
    public Marque convertToEntityAttribute(Integer code) {
        if (code == null) {
            return null;
        }

        return Marque.getByCode(code);
    }

}
