package DesignPatterns.factory.factoryMethod;

public class CarStore {
    public static void main(String[] args) {
        order(new BYDFactory());
    }

    public static void order(IFactory factory) {
        AbstractCar car = factory.createCar();
        System.out.println("订购成功：");
        car.info();
    }
}
