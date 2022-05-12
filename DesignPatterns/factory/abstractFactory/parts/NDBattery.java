package DesignPatterns.factory.abstractFactory.parts;

public class NDBattery implements IBattery {
    @Override
    public String createBattery() {
        return "ND battery";
    }
}
