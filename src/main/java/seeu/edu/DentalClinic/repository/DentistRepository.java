package seeu.edu.DentalClinic.repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import seeu.edu.DentalClinic.pojo.entity.Dentist;

import java.util.List;

@Repository
public interface DentistRepository extends CrudRepository<Dentist, Integer> {

    List<Dentist> findAll();

    Dentist findDentistByDentistId(Integer dentistId);


    @Query(
            "SELECT d FROM Dentist d WHERE d.dentistName= :dentistName "
    )
    List<Dentist> findDentistByDentistName(String dentistName);



}