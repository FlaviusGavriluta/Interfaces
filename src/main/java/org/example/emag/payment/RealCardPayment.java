package org.example.emag.payment;

public class RealCardPayment implements IPay {
    private final ValidateAntiFraud validator;

    public RealCardPayment(ValidateAntiFraud validator) {
        this.validator = validator;
    }

    public boolean communicateWithPaymentGateway(double amount) {
        return amount <= 500;
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing real card payment of $" + amount);
        return communicateWithPaymentGateway(amount);
    }

    @Override
    public boolean validateCard() {
        System.out.println("Validating real card...");
        return true;
    }
}
