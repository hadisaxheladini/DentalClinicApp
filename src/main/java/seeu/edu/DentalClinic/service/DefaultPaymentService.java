package seeu.edu.DentalClinic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import seeu.edu.DentalClinic.pojo.entity.Dentist;
import seeu.edu.DentalClinic.pojo.entity.Patient;
import seeu.edu.DentalClinic.pojo.entity.Payment;
import seeu.edu.DentalClinic.pojo.input.PaymentInput;
import seeu.edu.DentalClinic.repository.DentistRepository;
import seeu.edu.DentalClinic.repository.PatientRepository;
import seeu.edu.DentalClinic.repository.PaymentRepository;

import java.util.List;

@Service
public class DefaultPaymentService implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public List<Payment> findAll() {
        return paymentRepository.findAll();
    }

    @Override
    public Payment findOneById(Integer payment_id) {
        return paymentRepository.findPaymentByPaymentId(payment_id);
    }

    @Override
    public Payment save(PaymentInput paymentInput) {
        Integer total = paymentInput.getTotal();

        Payment payment = new Payment();
        payment.setTotal(total);

        return paymentRepository.save(payment);
    }

    @Override
    public Payment update(Integer payment_id, PaymentInput paymentInput) {
        Payment payment = paymentRepository.findPaymentByPaymentId(payment_id);

        if (payment == null) {
            return null;
        }

        Integer updatedTotal = paymentInput.getTotal();

        payment.setTotal(updatedTotal);

        return paymentRepository.save(payment);
    }

    @Override
    public void delete(Integer payment_id) {
        paymentRepository.deleteById(payment_id);

    }




}
