package DesignPatterns.factory.abstractFactory.parts;

public class BMWMotor implements IMotor {
    @Override
    public String createMotor() {
        return "BMW Motor";
    }
}
