package seeu.edu.DentalClinic.pojo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity
@Table(name = "payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "paymentId")
    private Integer paymentId;

    @Column(name = "total")
    private Integer total;

    public Payment() {
    }

    public Payment(Integer payment_id, Integer total) {
        this.paymentId = payment_id;
        this.total = total;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "patientId", referencedColumnName = "patientId")
    private Patient patient;


    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}