package seeu.edu.DentalClinic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import seeu.edu.DentalClinic.pojo.entity.Dentist;
import seeu.edu.DentalClinic.pojo.input.DentistInput;
import seeu.edu.DentalClinic.repository.DentistRepository;
import seeu.edu.DentalClinic.repository.PatientRepository;

import java.util.Collection;
import java.util.List;


@Service
public class DefaultDentistService implements DentistService {

    @Autowired
    private DentistRepository dentistRepository;

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public List<Dentist> findAll() {
        return dentistRepository.findAll();
    }


    @Override
    public Dentist save(DentistInput dentistInput) {
        String dentist_name = dentistInput.getDentist_name();
        Integer dentist_phone = dentistInput.getDentist_phone();

        Dentist dentist = new Dentist();
        dentist.setDentist_name(dentist_name);
        dentist.setDentist_phone(dentist_phone);

        return dentistRepository.save(dentist);
    }

    @Override
    public Dentist update(Integer dentist_id, DentistInput dentistInput) {
        Dentist dentist = dentistRepository.findDentistByDentistId(dentist_id);

        if (dentist == null) {
            return null;
        }

        String updatedDentistName= dentistInput.getDentist_name();
        Integer updatedDentistPhone = dentistInput.getDentist_phone();

        dentist.setDentist_name(updatedDentistName);
        dentist.setDentist_phone(updatedDentistPhone);

        return dentistRepository.save(dentist);
    }

    @Override
    public void delete(Integer dentist_id) {
        dentistRepository.deleteById(dentist_id);
    }

    @Override
    public List<Dentist>findDentistByDentistName(String dentistName) {
        return dentistRepository.findDentistByDentistName(dentistName);
    }


    @Override
    public Dentist findOneById(Integer dentist_id) {
        return dentistRepository.findDentistByDentistId(dentist_id);
    }
}
