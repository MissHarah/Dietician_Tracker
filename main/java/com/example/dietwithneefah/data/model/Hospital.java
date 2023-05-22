package com.example.dietwithneefah.data.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Hospital {
    private String id;
    @DBRef
    private Patient patient;
    @DBRef
    private Dietician dietician;
    private int ward;

}
