package DesignPatterns.factory.abstractFactory;

import DesignPatterns.factory.abstractFactory.parts.IBattery;
import DesignPatterns.factory.abstractFactory.parts.IMotor;
import DesignPatterns.factory.abstractFactory.partsFactory.IEnvPartsFactory;

public class Env {
    IBattery battery;
    IMotor motor;

    public Env(IEnvPartsFactory factory) {
        this.battery = factory.createBattery();
        this.motor = factory.createMotor();
    }

    public void info() {
        System.out.println("IEnv: " + battery.createBattery() + " " + motor.createMotor());
    }
}
