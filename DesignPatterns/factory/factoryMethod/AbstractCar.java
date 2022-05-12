package DesignPatterns.factory.factoryMethod;

public abstract class AbstractCar {
    public String brand; // 品牌
    public String model; // 型号
    public String color; // 颜色

    public void info() {
        System.out.println("品牌：" + brand);
        System.out.println("型号：" + model);
        System.out.println("颜色：" + color);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}


