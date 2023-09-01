package org.example.emag.delivery;

import org.example.emag.delivery.DeliveriRepository;

// Daca sunt developer, simuleaza chemarea unui curier
// Daca nu sunt developer, sunt la courier si ii trimit o cerere de livrare

public class Delivery {
    private final DeliveriRepository deliveriRepository;

    public Delivery(DeliveriRepository deliveriRepository) {
        this.deliveriRepository = deliveriRepository;
    }

}
