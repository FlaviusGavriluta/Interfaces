package org.example.ui;

import org.example.emag.delivery.Sameday;
import org.example.emag.delivery.SimulateDelivery;
import org.example.emag.payment.Checkout;
import org.example.emag.payment.FictitiousCardPayment;
import org.example.emag.payment.RealCardPayment;
import org.example.emag.payment.ValidateAntiFraudImpl;

public class EmagInterface {
    public void run() {

        Checkout checkout = new Checkout(new RealCardPayment(new ValidateAntiFraudImpl()), new Sameday());
        checkout.finishPurchase(300, 5);

        checkout = new Checkout(new FictitiousCardPayment(), new SimulateDelivery());
        checkout.finishPurchase(70, 3);
    }
}