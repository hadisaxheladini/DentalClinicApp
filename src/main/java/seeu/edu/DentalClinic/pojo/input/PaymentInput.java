package seeu.edu.DentalClinic.pojo.input;

public class PaymentInput {
    private Integer total;

    public PaymentInput(Integer total) {
        this.total = total;
    }
    public PaymentInput() {
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
