package seeu.edu.DentalClinic.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import seeu.edu.DentalClinic.pojo.entity.Patient;
import seeu.edu.DentalClinic.pojo.entity.Payment;

import java.util.List;

@Repository
public interface PaymentRepository extends CrudRepository<Payment, Integer>{
    List<Payment> findAll();



    Payment findPaymentByPaymentId(Integer payment_id);




}

