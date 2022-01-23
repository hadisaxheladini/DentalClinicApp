package seeu.edu.DentalClinic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import seeu.edu.DentalClinic.pojo.entity.Dentist;
import seeu.edu.DentalClinic.pojo.input.DentistInput;
import seeu.edu.DentalClinic.repository.DentistRepository;
import seeu.edu.DentalClinic.service.DentistService;

import java.util.List;

@RestController
public class DentistController {

    @Autowired
    public DentistService dentistService;



    @GetMapping("/dentist")
    public List<Dentist> getAllDentist() {
        return dentistService.findAll();
    }


    @GetMapping("/dentist/{dentist_id}")
    public Dentist getDentistById(@PathVariable Integer dentist_id) {
        return dentistService.findOneById(dentist_id);
    }

    @PostMapping("/dentist")
    public Dentist insertNewDentist(@RequestBody DentistInput dentistInput) {
        return dentistService.save(dentistInput);
    }

    @PutMapping("/dentist/{dentist_id}")
    public Dentist updateDentist(@PathVariable Integer dentist_id,
                                 @RequestBody DentistInput dentistInput) {

            return dentistService.update(dentist_id,dentistInput);
        }

    @DeleteMapping("/dentist/{dentist_id}")
    public Boolean deleteDentist(@PathVariable Integer dentist_id) {
            dentistService.delete(dentist_id);
            return true;
    }

    @GetMapping("/dentist/name/{dentistName}")
    public List<Dentist> findDentistByDentistName(@PathVariable String dentistName) {
        return dentistService.findDentistByDentistName(dentistName);
    }



}
