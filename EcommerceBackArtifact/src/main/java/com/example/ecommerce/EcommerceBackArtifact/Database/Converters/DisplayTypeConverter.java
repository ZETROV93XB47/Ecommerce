package com.example.ecommerce.EcommerceBackArtifact.Database.Converters;

import com.example.ecommerce.EcommerceBackArtifact.Model.enums.DISPLAY_TYPE;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class DisplayTypeConverter implements AttributeConverter<DISPLAY_TYPE, Integer> {

    @Override
    public Integer convertToDatabaseColumn(DISPLAY_TYPE displayType) {
        return displayType == null ? null : displayType.getCode();
    }

    @Override
    public DISPLAY_TYPE convertToEntityAttribute(Integer code) {
        if (code == null) {
            return null;
        }

        return DISPLAY_TYPE.getByCode(code);
    }

}
