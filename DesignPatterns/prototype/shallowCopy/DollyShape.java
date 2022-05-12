package DesignPatterns.prototype.shallowCopy;

public class DollyShape extends Shape {

    
    public DollyShape(String name, String color) {
        super(name, color);
    }

    public static void main(String[] args) throws Exception {

        Shape friend = new DollyShape("Friend", "Blue");

        Shape dolly = new DollyShape("Dolly", "Red");

        dolly.friend = friend;

        System.out.println(dolly.name + " " + dolly.color + " " + dolly.friend.hashCode());
        
        Shape dolly1 = (Shape) dolly.clone();

        System.out.println(dolly1.name + " " + dolly1.color + " " + dolly1.friend.hashCode());
    }
}
