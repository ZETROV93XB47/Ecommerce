package com.example.ecommerce.EcommerceBackArtifact.Database.Converters;

import com.example.ecommerce.EcommerceBackArtifact.Model.enums.Category;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class CategoryTypeConverter implements AttributeConverter<Category, Integer> {

    @Override
    public Integer convertToDatabaseColumn(Category category) {
        return category == null ? null : category.getCode();
    }

    @Override
    public Category convertToEntityAttribute(Integer code) {
        if (code == null) {
            return null;
        }

        return Category.getByCode(code);
    }

}
