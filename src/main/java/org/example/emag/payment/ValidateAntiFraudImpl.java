package org.example.emag.payment;

public class ValidateAntiFraudImpl implements ValidateAntiFraud{
    @Override
    public boolean isCardStolen() {
        return false;
    }
}
