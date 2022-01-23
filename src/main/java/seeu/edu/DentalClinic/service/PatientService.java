package seeu.edu.DentalClinic.service;

import seeu.edu.DentalClinic.pojo.entity.Patient;
import seeu.edu.DentalClinic.pojo.input.PatientInput;

import java.util.List;

public interface PatientService {

    List<Patient> findAll();
    Patient findOneById(Integer patient_id);
    Patient save(PatientInput patientInput);
    Patient update(Integer patient_id, PatientInput patientInput);
    void delete(Integer patient_id);

   List<Patient> findPatientByPatientName(String patientName);

   List<Patient> findPatientByPaymentId(Integer paymentId);



}
