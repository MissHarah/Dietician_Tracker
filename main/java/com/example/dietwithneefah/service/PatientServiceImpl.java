package com.example.dietwithneefah.service;

import com.example.dietwithneefah.data.dto.Response.MedicalConditionResponse;
import com.example.dietwithneefah.data.dto.Response.PatientResponse;
import com.example.dietwithneefah.data.dto.request.PatientRegistrationRequest;
import com.example.dietwithneefah.data.model.MedicalCondition;

import java.util.List;

public class PatientServiceImpl implements PatientService{
    
    @Override
    public PatientResponse registerPatient(PatientRegistrationRequest patientRegistrationRequest) {

        return null;
    }

    @Override
    public List<MedicalCondition> getAllMedicalCondition() {
        return null;
    }

    @Override
    public MedicalConditionResponse findMedicalCondition(String medicalCondition) {
        return null;
    }

    @Override
    public String findPatientById(String id) {
        return null;
    }

    @Override
    public List<PatientService> findAllPatient() {
        return null;
    }
}
