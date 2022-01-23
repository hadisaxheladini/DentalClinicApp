package seeu.edu.DentalClinic.pojo.input;

public class Medical_recordsInput {
    private String reason;
    private String medicine;

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

    public Medical_recordsInput() {
    }

    public Medical_recordsInput(String reason, String medicine) {
        this.reason = reason;
        this.medicine = medicine;
    }
}
