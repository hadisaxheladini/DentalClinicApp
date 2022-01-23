package seeu.edu.DentalClinic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import seeu.edu.DentalClinic.pojo.entity.Dentist;
import seeu.edu.DentalClinic.pojo.entity.Patient;
import seeu.edu.DentalClinic.pojo.input.PatientInput;
import seeu.edu.DentalClinic.repository.Medical_recordsRepository;
import seeu.edu.DentalClinic.repository.PatientRepository;

import java.util.List;

@Service
public class DefaultPatientService implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private Medical_recordsRepository medical_recordsRepository;


    @Override
    public List<Patient> findAll() {
        return patientRepository.findAll();
    }

    @Override
    public Patient findOneById(Integer patient_id) {
        return patientRepository.findPatientByPatientId(patient_id);
    }


    @Override
    public Patient save(PatientInput patientInput) {
        String patient_name = patientInput.getPatient_name();
        Integer patient_phone = patientInput.getPatient_phone();

        Patient patient = new Patient();
        patient.setPatient_name(patient_name);
        patient.setPatient_phone(patient_phone);

        return patientRepository.save(patient);

    }

    @Override
    public Patient update(Integer patient_id, PatientInput patientInput) {
        Patient patient = patientRepository.findPatientByPatientId(patient_id);

        if (patient == null) {
            return null;
        }

        String updatedPatientName= patientInput.getPatient_name();
        Integer updatedPatientPhone = patientInput.getPatient_phone();

        patient.setPatient_name(updatedPatientName);
        patient.setPatient_phone(updatedPatientPhone);

        return patientRepository.save(patient);

    }

    @Override
    public void delete(Integer patient_id) {
        patientRepository.deleteById(patient_id);

    }

    @Override
    public List<Patient> findPatientByPatientName(String patientName) {
        return patientRepository.findPatientByPatientName(patientName);
    }

    @Override
    public List<Patient> findPatientByPaymentId(Integer paymentId) {
        return patientRepository.findPatientByPaymentId(paymentId);
    }

}

