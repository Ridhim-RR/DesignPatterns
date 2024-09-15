package Adpater;

public interface PaymentProvider {
    void makePayment();
    String getStatus(String paymentId);
}
