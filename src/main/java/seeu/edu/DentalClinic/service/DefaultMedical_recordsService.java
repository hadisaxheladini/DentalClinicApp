package seeu.edu.DentalClinic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import seeu.edu.DentalClinic.pojo.entity.Dentist;
import seeu.edu.DentalClinic.pojo.entity.Medical_records;
import seeu.edu.DentalClinic.pojo.input.Medical_recordsInput;
import seeu.edu.DentalClinic.repository.DentistRepository;
import seeu.edu.DentalClinic.repository.Medical_recordsRepository;
import seeu.edu.DentalClinic.repository.PatientRepository;

import java.util.List;

@Service
public class DefaultMedical_recordsService implements Medical_recordsService{

    @Autowired
    private Medical_recordsRepository medical_recordsRepository;

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public List<Medical_records> findAll() {
        return medical_recordsRepository.findAll();
    }

    @Override
    public Medical_records findOneById(Integer record_id) {
        return medical_recordsRepository.findMedicalRecordByRecordId(record_id);
    }

    @Override
    public Medical_records save(Medical_recordsInput medical_recordsInput) {
        String reason= medical_recordsInput.getReason();
        String medicine = medical_recordsInput.getMedicine();

        Medical_records medical_records = new Medical_records();
        medical_records.setReason(reason);
        medical_records.setMedicine(medicine);

        return medical_recordsRepository.save(medical_records);
    }

    @Override
    public Medical_records update(Integer record_id, Medical_recordsInput medical_recordsInput) {
        Medical_records medical_records = medical_recordsRepository.findMedicalRecordByRecordId(record_id);

        if (medical_records == null) {
            return null;
        }

        String updatedReason= medical_recordsInput.getReason();
        String updatedMedicine = medical_recordsInput.getMedicine();

        medical_records.setReason(updatedReason);
        medical_records.setMedicine(updatedMedicine);

        return medical_recordsRepository.save(medical_records);
    }

    @Override
    public void delete(Integer record_id) {
        medical_recordsRepository.deleteById(record_id);

    }

}
