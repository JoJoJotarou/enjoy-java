package DesignPatterns.prototype;

public abstract class Shape implements Cloneable {

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String name;

    public String color;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
