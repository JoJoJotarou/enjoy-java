package DesignPatterns.factory.abstractFactory.partsFactory;

import DesignPatterns.factory.abstractFactory.parts.AudiMotor;
import DesignPatterns.factory.abstractFactory.parts.IBattery;
import DesignPatterns.factory.abstractFactory.parts.IMotor;
import DesignPatterns.factory.abstractFactory.parts.NDBattery;

public class CDEnvPartsFactory implements IEnvPartsFactory{
    @Override
    public IBattery createBattery() {
        return new NDBattery();
    }
    @Override
    public IMotor createMotor() {
        return new AudiMotor();
    }
}
