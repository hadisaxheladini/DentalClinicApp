package seeu.edu.DentalClinic.pojo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "dentist")
public class Dentist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dentistId")
    private Integer dentistId;

    @Column(name = "dentistName")
    private String dentistName;

    @Column(name = "dentist_phone")
    private Integer dentist_phone;

    @OneToMany(mappedBy = "dentist")
    @JsonManagedReference
    private List<Patient> patient;

    @OneToMany(mappedBy = "dentistroom")
    @JsonManagedReference
    private List<Room> room;

    public Dentist() {
    }

    public Dentist(Integer dentist_id, String dentist_name, Integer dentist_phone) {
        this.dentistId = dentist_id;
        this.dentistName = dentist_name;
        this.dentist_phone = dentist_phone;
    }

    public Integer getDentistId() {
        return dentistId;
    }

    public void setDentistId(Integer dentistId) {
        this.dentistId = dentistId;
    }

    public String getDentist_name() {
        return dentistName;
    }

    public void setDentist_name(String dentist_name) {
        this.dentistName = dentist_name;
    }

    public Integer getDentist_phone() {
        return dentist_phone;
    }

    public void setDentist_phone(Integer dentist_phone) {
        this.dentist_phone = dentist_phone;
    }
}