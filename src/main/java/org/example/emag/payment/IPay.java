package org.example.emag.payment;

public interface IPay {
    boolean processPayment(double amount);

    boolean validateCard();
}
