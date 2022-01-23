package seeu.edu.DentalClinic.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import seeu.edu.DentalClinic.pojo.entity.Dentist;
import seeu.edu.DentalClinic.pojo.entity.Patient;
import seeu.edu.DentalClinic.pojo.entity.Payment;
import seeu.edu.DentalClinic.repository.PaymentRepository;
import seeu.edu.DentalClinic.service.PaymentService;

import java.util.List;

@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;



    @GetMapping("/payment")
    public List<Payment> findAll() {
        return paymentService.findAll();
    }



    @GetMapping("/payment/{payment_id}")
    public Payment findOne(@PathVariable Integer payment_id) {
        return paymentService.findOneById(payment_id);
    }




}