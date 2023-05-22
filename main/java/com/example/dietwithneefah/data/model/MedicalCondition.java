package com.example.dietwithneefah.data.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class MedicalCondition {
    private String id;
    private String conditionType;
    private String description;
}
