package com.example.dietwithneefah.data.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Document
@Data
public class Dietician {
    private String id;
    @DBRef
    private Set<Patient> patient;
    private String emailAddress;
    private String phoneNumber;
}
