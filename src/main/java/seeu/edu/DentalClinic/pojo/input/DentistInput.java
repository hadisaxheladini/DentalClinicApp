package seeu.edu.DentalClinic.pojo.input;

public class DentistInput {
    private String dentist_name;
    private Integer dentist_phone;

    public DentistInput() {
    }

    public DentistInput(String dentist_name, Integer dentist_phone) {
        this.dentist_name = dentist_name;
        this.dentist_phone = dentist_phone;
    }

    public String getDentist_name() {
        return dentist_name;
    }

    public void setDentist_name(String dentist_name) {
        this.dentist_name = dentist_name;
    }

    public Integer getDentist_phone() {
        return dentist_phone;
    }

    public void setDentist_phone(Integer dentist_phone) {
        this.dentist_phone = dentist_phone;
    }
}
