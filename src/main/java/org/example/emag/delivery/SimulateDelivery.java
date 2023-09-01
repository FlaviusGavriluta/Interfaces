package org.example.emag.delivery;

import java.time.LocalDate;

public class SimulateDelivery implements DeliveriRepository {
    @Override
    public double calculateShippingCost(double packageWeight) {
        return 5.0;
    }

    @Override
    public LocalDate estimateDeliveryDate() {
        return LocalDate.now().plusDays(1);
    }
}
