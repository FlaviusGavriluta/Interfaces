package org.example.emag.delivery;

import java.time.LocalDate;

public class Sameday implements DeliveriRepository {
    @Override
    public double calculateShippingCost(double packageWeight) {
        return 5 + (2 * packageWeight);
    }

    @Override
    public LocalDate estimateDeliveryDate() {
        return LocalDate.now().plusDays(1);
    }
}
