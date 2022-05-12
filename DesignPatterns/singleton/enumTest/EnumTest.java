package DesignPatterns.singleton.enumTest;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import DesignPatterns.singleton.Eager;
import DesignPatterns.singleton.EnumSingleton;
import DesignPatterns.singleton.Lazy;

/**
 * EnumSingleton 测试反序列化时不会创建对象
 */


public class EnumTest implements Serializable {

    public String name;

    public EnumSingleton singleton;

    public Eager eager;

    public Lazy lazy;

    public EnumTest() {
        name = "EnumTest";
        singleton = EnumSingleton.INSTANCE;
        eager = Eager.getInstance();
        lazy = Lazy.getInstance();
    }
}

/**
 * InnerEnumSingleton
 */
class InnerEnumSingleton {

    public static void main(String[] args) {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            EnumTest test = new EnumTest();
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(test);
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            EnumTest test2 = (EnumTest) ois.readObject();

            System.out.println(test.name + " " + test.singleton.hashCode() + " " + test.eager.hashCode() + " " + test.lazy.hashCode());
            System.out.println(test2.name + " " + test2.singleton.hashCode() + " " + test2.eager.hashCode() + " " + test2.lazy.hashCode());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
                if (bis != null) {
                    bis.close();
                }
                if (oos != null) {
                    oos.close();
                }
                if (bos != null) {
                    bos.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
