package org.example.emag.payment;

public class FictitiousCardPayment implements IPay {
    private boolean fictitiousPaymentGateway(double amount) {
        return amount <= 200;
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing fictitious card payment of $" + amount);
        return fictitiousPaymentGateway(amount);
    }

    @Override
    public boolean validateCard() {
        System.out.println("Validating fictitious card...");
        return true;
    }
}
