package DesignPatterns.factory.factoryMethod;

public class AudiFactory implements IFactory {
    @Override
    public AbstractCar createCar() {
        return new AudiCar();
    }
}
