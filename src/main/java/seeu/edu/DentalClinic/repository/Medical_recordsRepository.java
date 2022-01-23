package seeu.edu.DentalClinic.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import seeu.edu.DentalClinic.pojo.entity.Medical_records;

import java.util.List;

@Repository
public interface Medical_recordsRepository extends CrudRepository<Medical_records, Integer>  {
    List<Medical_records> findAll();



    Medical_records findMedicalRecordByRecordId(Integer record_id);
}


