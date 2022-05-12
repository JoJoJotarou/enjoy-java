package DesignPatterns.prototype.deepCopy2;

public abstract class Shape {

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String name;

    public String color;

    public Shape friend;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object object = super.clone();

        Shape shape = (Shape) object;

        if (shape.friend != null) {

            shape.friend = (Shape) shape.friend.clone();
        }

        return shape;
    }
}
