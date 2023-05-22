package com.example.dietwithneefah.service;

import com.example.dietwithneefah.data.dto.Response.MedicalConditionResponse;
import com.example.dietwithneefah.data.dto.Response.PatientResponse;
import com.example.dietwithneefah.data.dto.request.PatientRegistrationRequest;
import com.example.dietwithneefah.data.model.MedicalCondition;

import java.util.List;

public interface PatientService {
    PatientResponse registerPatient(PatientRegistrationRequest patientRegistrationRequest);

     List<MedicalCondition> getAllMedicalCondition();

     MedicalConditionResponse findMedicalCondition(String medicalCondition);

     String findPatientById(String id);

     List<PatientService> findAllPatient();




}
