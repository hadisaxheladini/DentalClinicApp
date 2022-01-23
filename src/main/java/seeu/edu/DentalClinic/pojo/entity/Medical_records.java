package seeu.edu.DentalClinic.pojo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "medical_records")
public class Medical_records {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "recordId")
    private Integer recordId;

    @Column(name = "reason")
    private String reason;

    @Column(name = "medicine")
    private String medicine;

    @ManyToOne
    @JoinColumn(name = "patientId")
    @JsonBackReference
    private Patient patient;

    public Medical_records() {
    }

    public Medical_records(Integer record_id, String reason, String medicine) {
        this.recordId = record_id;
        this.reason = reason;
        this.medicine = medicine;
    }

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }
}