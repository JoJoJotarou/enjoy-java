package DesignPatterns.factory.factoryMethod;

public class BYDFactory implements IFactory {

    @Override
    public AbstractCar createCar() {
        return new BYDCar();
    }

}
