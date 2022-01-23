package seeu.edu.DentalClinic.service;

import seeu.edu.DentalClinic.pojo.entity.Dentist;
import seeu.edu.DentalClinic.pojo.entity.Patient;
import seeu.edu.DentalClinic.pojo.entity.Payment;
import seeu.edu.DentalClinic.pojo.input.DentistInput;
import seeu.edu.DentalClinic.pojo.input.PaymentInput;

import java.util.List;

public interface PaymentService {
    List<Payment> findAll();

    Payment findOneById(Integer payment_id);
    Payment save(PaymentInput paymentInput);
    Payment update(Integer payment_id, PaymentInput paymentInput);
    void delete(Integer payment_id);






}

