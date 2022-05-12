package DesignPatterns.factory.simpleFactory;

public abstract class AbstractCar {
    public String brand; // 品牌
    public String model; // 型号
    public String color; // 颜色

    public void info() {
        System.out.println("品牌：" + brand);
        System.out.println("型号：" + model);
        System.out.println("颜色：" + color);
    }    
}


