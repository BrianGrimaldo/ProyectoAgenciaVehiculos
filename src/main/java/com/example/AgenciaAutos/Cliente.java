package com.example.AgenciaAutos;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Document(collection = "Cliente")
@Data
public class Cliente {
    @Id
    private ObjectId id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
}
