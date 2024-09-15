package Adpater;

public class main {
    public static void main(String[] args) {
   PaymentProvider stripe = new StripeAdapter();
   PaymentProvider paypal = new PayPalAdapter();

   PaymentProcessor paymentProcessor = new PaymentProcessor(paypal);
   paymentProcessor.processPayment();
    }
}
//The adapter pattern is a software design pattern (also known as wrapper, an alternative naming shared with the
// decorator pattern) that allows the interface of an existing class to be used from another interface.
// It is often used to make existing classes work with others without modifying their source code.