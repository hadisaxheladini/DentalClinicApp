package seeu.edu.DentalClinic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import seeu.edu.DentalClinic.pojo.entity.Medical_records;
import seeu.edu.DentalClinic.repository.Medical_recordsRepository;

import java.util.List;


    @RestController
    public class Medical_recordsController {

        @Autowired
        private Medical_recordsRepository medical_recordsRepository;




        @GetMapping("/medical_records")
        public List<Medical_records> findAll() {
            return medical_recordsRepository.findAll();
        }





        @GetMapping("/medical_records/{record_id}")
        public Medical_records findOne(@PathVariable Integer record_id) {return medical_recordsRepository.findMedicalRecordByRecordId(record_id);
        }
    }

