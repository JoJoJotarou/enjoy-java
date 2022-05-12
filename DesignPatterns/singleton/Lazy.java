package DesignPatterns.singleton;

import java.io.Serializable;

/**
 * Lazy
 */
public class Lazy implements Serializable {
    // 什么是单例：单例是指一个类有且只有一个实例对象。
    // 1. 首先要控制单例类不能被外部通过 new 创建即，故需要将构造器使用 private 修饰
    // 2. 由于单例类不能是实例化，那么就需要提供一个public static修饰的方法 getInstance 供外部调用（静态方法属于类可以用类直接调用）
    // 3. 单例表示类的实例不能被修改，故使用 private static 修饰变量 INSTANCE（这个变量如果放在 getInstance 方法里每次调用都会被改变）
    // 4. 懒汉式指的仅当被获取时创建实例，故INSTANCE的初始值为 null
    // 5. 这种写法的懒汉式是线程不安全的

    private Lazy() {
    }
    
    private static Lazy INSTANCE;

    public static Lazy getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Lazy();
        }
        
        return INSTANCE;
    }
    
}

/**
 * Test
 */
class LazyTest {
    public static void main(String[] args) {
        Lazy l1 = Lazy.getInstance();

        Lazy l2 = Lazy.getInstance();
        
        System.out.println(l1 == l2);

        System.out.println(l1.hashCode() == l2.hashCode());

        try {
            // 本质上调用newInstance()也是通过构造器
            Lazy l3 = (Lazy) Class.forName("DesignPatterns.singleton.Lazy").newInstance();
            System.out.println(l1.hashCode() == l3.hashCode());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
