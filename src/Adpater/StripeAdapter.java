package Adpater;

import Adpater.ThirdParty.StripeApi;

public class StripeAdapter implements PaymentProvider {

    private StripeApi stripeApi = new StripeApi();

    @Override
    public void makePayment() {
        stripeApi.createPayment();
    }

    @Override
    public String getStatus(String paymentId) {
        return   stripeApi.checkStatus(paymentId);
    }
}