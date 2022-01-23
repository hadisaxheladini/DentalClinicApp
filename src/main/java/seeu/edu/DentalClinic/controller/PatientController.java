package seeu.edu.DentalClinic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import seeu.edu.DentalClinic.pojo.entity.Dentist;
import seeu.edu.DentalClinic.pojo.entity.Patient;
import seeu.edu.DentalClinic.pojo.input.PatientInput;
import seeu.edu.DentalClinic.repository.PatientRepository;
import seeu.edu.DentalClinic.service.PatientService;

import java.util.List;

@RestController
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping("/patient")
    public List<Patient> getAllPatient() {
        return patientService.findAll();
    }

    @GetMapping("patient/{patient_id}")
    public Patient getPatientById(@PathVariable Integer patient_id) {
        return patientService.findOneById(patient_id);

    }

    @PostMapping("/patient")
    public Patient insertNewPatient(@RequestBody PatientInput patientInput) {

        return patientService.save(patientInput);
    }

    @PutMapping("/patient/{patient_id}")
    public Patient updatePatient(@PathVariable Integer patient_id,
                                 @RequestBody PatientInput patientInput) {

            return patientService.update(patient_id,patientInput);
        }

    @DeleteMapping("/patient/{patient_id}")
    public Boolean deletePatient(@PathVariable Integer patient_id) {
        patientService.delete(patient_id);
        return true;
    }

    @GetMapping("/patient/name/{patientName}")
    public List<Patient> findPatientByPatientName(@PathVariable String patientName) {
        return patientService.findPatientByPatientName(patientName);
    }

    @GetMapping("/patient/findbypaymentid/{paymentId}")
    public List<Patient> findPatientByPaymentId(@PathVariable Integer paymentId) {
        return patientService.findPatientByPaymentId(paymentId);
    }

}

