package com.pm.patientservice.service;

import com.pm.patientservice.dto.PatientResponseDTO;
import com.pm.patientservice.model.Patient;
import com.pm.patientservice.repository.PatientRepository;
import mapper.PatientMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class PatientService {
    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<PatientResponseDTO> getPatients() {
      List<Patient> patients = patientRepository.findAll();
      List<PatientResponseDTO> patientResponseDTOs = patients.stream()
              .map(PatientMapper :: toDto).toList();
        return patientResponseDTOs;
    }
}
