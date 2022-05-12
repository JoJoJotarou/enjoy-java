package DesignPatterns.factory.factoryMethod;

public class BMWFactory implements IFactory {

    @Override
    public AbstractCar createCar() {
        return new BMWCar();
    }

}
