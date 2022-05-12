package DesignPatterns.factory.abstractFactory.partsFactory;

import DesignPatterns.factory.abstractFactory.parts.BMWMotor;
import DesignPatterns.factory.abstractFactory.parts.BYDBattery;
import DesignPatterns.factory.abstractFactory.parts.IBattery;
import DesignPatterns.factory.abstractFactory.parts.IMotor;

public class SHEnvPartsFactory implements IEnvPartsFactory {
    @Override
    public IBattery createBattery() {
        return new BYDBattery();
    }
    @Override
    public IMotor createMotor() {
        return new BMWMotor();
    }
}
