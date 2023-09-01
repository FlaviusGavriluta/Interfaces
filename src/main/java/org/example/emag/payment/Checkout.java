package org.example.emag.payment;

import org.example.emag.delivery.DeliveriRepository;

import java.time.LocalDate;

public class Checkout {
    private IPay paymentMethod;
    private DeliveriRepository deliveryMethod;

    public Checkout(IPay paymentMethod, DeliveriRepository deliveryMethod) {
        this.paymentMethod = paymentMethod;
        this.deliveryMethod = deliveryMethod;
    }


    public void finishPurchase(double amount, double packageWeight) {
        if (paymentMethod.processPayment(amount)) {
            System.out.println("Payment successful!");
            double shippingCost = deliveryMethod.calculateShippingCost(packageWeight);
            LocalDate deliveryDate = deliveryMethod.estimateDeliveryDate();
            System.out.println("Shipping cost: $" + shippingCost);
            System.out.println("Estimated delivery date: " + deliveryDate);
        } else System.out.println("Payment failed!");
    }
}
