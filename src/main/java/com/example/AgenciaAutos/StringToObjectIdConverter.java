package com.example.AgenciaAutos;

import org.bson.types.ObjectId;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToObjectIdConverter implements Converter<String, ObjectId> {
    @Override
    public ObjectId convert(@SuppressWarnings("null") String source) {
        if (ObjectId.isValid(source)) {
            return new ObjectId(source);
        } else {
            throw new IllegalArgumentException("Invalid ObjectId: " + source);
        }
    }
}
