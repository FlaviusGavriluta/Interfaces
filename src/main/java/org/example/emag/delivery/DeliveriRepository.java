package org.example.emag.delivery;

import java.time.LocalDate;

public interface DeliveriRepository {
    double calculateShippingCost(double packageWeight);

    LocalDate estimateDeliveryDate();
}
