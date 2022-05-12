package DesignPatterns.factory.abstractFactory.parts;

public class BYDBattery implements IBattery {
    @Override
    public String createBattery() {
        return "BYD battery";
    }
}
