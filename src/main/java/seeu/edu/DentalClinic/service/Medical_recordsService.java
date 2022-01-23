package seeu.edu.DentalClinic.service;

import seeu.edu.DentalClinic.pojo.entity.Dentist;
import seeu.edu.DentalClinic.pojo.entity.Medical_records;
import seeu.edu.DentalClinic.pojo.input.DentistInput;
import seeu.edu.DentalClinic.pojo.input.Medical_recordsInput;

import java.util.List;

public interface Medical_recordsService {
    List<Medical_records> findAll();

    Medical_records findOneById(Integer record_id);
    Medical_records save(Medical_recordsInput medical_recordsInput);
    Medical_records update(Integer record_id, Medical_recordsInput medical_recordsInput);
    void delete(Integer record_id);


}

