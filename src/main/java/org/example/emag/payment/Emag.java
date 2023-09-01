package org.example.emag.payment;

import org.example.emag.delivery.DeliveriRepository;
import org.example.emag.payment.IPay;

import java.time.LocalDate;

// daca este un client real, i-ai banii de pe card;
// daca este developerul aplicatiei emag, sa nu ia bani;

public class Emag implements DeliveriRepository {
    private final IPay payment;

    public Emag(IPay payment) {
        this.payment = payment;
    }

    @Override
    public double calculateShippingCost(double packageWeight) {
        return 5 + (2 * packageWeight);
    }

    @Override
    public LocalDate estimateDeliveryDate() {
        return LocalDate.now().plusDays(3);
    }
}
