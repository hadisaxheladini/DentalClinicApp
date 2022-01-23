package seeu.edu.DentalClinic.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import seeu.edu.DentalClinic.pojo.entity.Patient;

import java.util.List;

@Repository
public interface PatientRepository extends CrudRepository<Patient, Integer> {

    List<Patient> findAll();
    Patient findPatientByPatientId(Integer patientId);

    @Query(
            "SELECT p FROM Patient p WHERE p.patientName= :patientName "
    )

     List<Patient> findPatientByPatientName(String patientName);

    @Query(
            "SELECT t FROM Patient t "+
                    "JOIN FETCH Payment p ON p.patient.patientId = t.patientId "+
                    "WHERE p.paymentId = :paymentId"
    )
    List<Patient> findPatientByPaymentId(@Param("paymentId") Integer paymentId);

}
