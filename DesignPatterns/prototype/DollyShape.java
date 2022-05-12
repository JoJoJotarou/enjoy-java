package DesignPatterns.prototype;

public class DollyShape extends Shape {

    public DollyShape(String name, String color) {
        super(name, color);
    }

    public static void main(String[] args) throws Exception {
        Shape dolly = new DollyShape("Dolly", "Red");
        System.out.println(dolly.name + " " + dolly.color);
        
        Shape dolly1 = (Shape) dolly.clone();

        Shape dolly2 = (Shape) dolly.clone();

        Shape dolly3 = (Shape) dolly.clone();
        
        System.out.println(dolly1.name + " " + dolly1.color);
        System.out.println(dolly2.name + " " + dolly2.color);
        System.out.println(dolly3.name + " " + dolly3.color);


        System.out.println(dolly == dolly1); // false
    }
}
