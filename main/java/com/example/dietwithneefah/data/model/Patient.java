package com.example.dietwithneefah.data.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Patient {
    private String id;
    private String emailAddress;
    private String address;
    private MedicalCondition medicalCondition;
    private String admitted;
    private String phoneNumber;
}
