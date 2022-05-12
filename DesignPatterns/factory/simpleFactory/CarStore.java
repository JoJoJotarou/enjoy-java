package DesignPatterns.factory.simpleFactory;

public class CarStore {
    public static void order(String carType) {
        AbstractCar car = CarFactory.createCar(carType);
        System.out.println("订购成功：");
        car.info();
    }

    public static void main(String[] args) {
        // test simple factory
        order("BYD");
    }
}
