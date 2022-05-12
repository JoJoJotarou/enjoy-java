package DesignPatterns.prototype.deepCopy1;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DollyShape extends Shape {

    
    public DollyShape(String name, String color) {
        super(name, color);
    }

    public static void main(String[] args) throws Exception {

        DollyShape friend = new DollyShape("Friend", "Blue");

        Shape dolly = new DollyShape("Dolly", "Red");

        dolly.friend = friend;

        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;

        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;


        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(dolly);

            bis = new ByteArrayInputStream(bos.toByteArray());

            ois = new ObjectInputStream(bis);

            Shape dolly1 = (Shape) ois.readObject();

            System.out.println(dolly.name + " " + dolly.color + " " +
            dolly.friend.hashCode());


            System.out.println(dolly1.name + " " + dolly1.color + " " +
            dolly1.friend.hashCode());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (oos != null) {
                oos.close();
            }
            if (bos != null) {
                bos.close();
            }
            if (ois != null) {
                ois.close();
            }
            if (bis != null) {
                bis.close();
            }
        }
    }
}
