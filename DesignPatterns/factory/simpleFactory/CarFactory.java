package DesignPatterns.factory.simpleFactory;

public class CarFactory {
    
    public static AbstractCar createCar(String carType) {
        AbstractCar car = null;
        if ("BYD".equals(carType)) {
            car = new BYDCar();
        } else if ("Audi".equals(carType)) {
            car = new AudiCar();
        } else if ("BMW".equals(carType)) {
            car = new BMWCar();
        }
        return car;
    }
}
