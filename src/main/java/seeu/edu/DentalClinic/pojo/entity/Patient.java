package seeu.edu.DentalClinic.pojo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patientId")
    private Integer patientId;

    @Column(name = "patientName")
    private String patientName;

    @Column(name = "patient_phone")
    private Integer patient_phone;

    @ManyToOne
    @JoinColumn(name = "dentist_id")
    @JsonBackReference
    private Dentist dentist;

    @OneToMany(mappedBy = "patient")
    @JsonManagedReference
    private List<Medical_records> medical_records;

    @OneToOne(mappedBy = "patient")
    private Payment payment;

    public Patient() {
    }

    public Patient(Integer patient_id, String patient_name, Integer patient_phone) {
        this.patientId = patient_id;
        this.patientName = patient_name;
        this.patient_phone = patient_phone;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public String getPatient_name() {
        return patientName;
    }

    public void setPatient_name(String patient_name) {
        this.patientName = patient_name;
    }

    public Integer getPatient_phone() {
        return patient_phone;
    }

    public void setPatient_phone(Integer patient_phone) {
        this.patient_phone = patient_phone;
    }
}
