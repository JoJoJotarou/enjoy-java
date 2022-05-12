package DesignPatterns.factory.abstractFactory.partsFactory;

import DesignPatterns.factory.abstractFactory.parts.IBattery;
import DesignPatterns.factory.abstractFactory.parts.IMotor;

public interface IEnvPartsFactory {
    IBattery createBattery();
    IMotor createMotor();
}
