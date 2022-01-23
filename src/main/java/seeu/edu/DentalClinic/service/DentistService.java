package seeu.edu.DentalClinic.service;

import seeu.edu.DentalClinic.pojo.entity.Dentist;
import seeu.edu.DentalClinic.pojo.input.DentistInput;


import java.util.List;


public interface DentistService {

    List<Dentist> findAll();

    Dentist findOneById(Integer dentist_id);
    Dentist save(DentistInput dentistInput);
    Dentist update(Integer dentist_id, DentistInput dentistInput);
    void delete(Integer dentist_id);


    List<Dentist> findDentistByDentistName(String dentistName);






}