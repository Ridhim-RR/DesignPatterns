package Adpater;

import Adpater.ThirdParty.PayPalApi;

public class PayPalAdapter implements PaymentProvider {
private PayPalApi payPalApi = new PayPalApi();
    @Override
    public void makePayment() {
      payPalApi.makePayment();
    }

    @Override
    public String getStatus(String paymentId) {
        return payPalApi.getStatus(paymentId);
    }
}