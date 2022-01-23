package seeu.edu.DentalClinic.pojo.input;

public class PatientInput {

        private String patient_name;
        private Integer patient_phone;

    public PatientInput() {
    }

    public PatientInput(String patient_name, Integer patient_phone) {
        this.patient_name = patient_name;
        this.patient_phone = patient_phone;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    public Integer getPatient_phone() {
        return patient_phone;
    }

    public void setPatient_phone(Integer patient_phone) {
        this.patient_phone = patient_phone;
    }


}
