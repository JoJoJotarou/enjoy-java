package DesignPatterns.prototype.deepCopy1;

import java.io.Serializable;

public class Shape implements Serializable {

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String name;

    public String color;

    public Shape friend;

}
