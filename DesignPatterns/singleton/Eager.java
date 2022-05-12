package DesignPatterns.singleton;

import java.io.Serializable;

/**
 * Eager
 */
public class Eager implements Serializable {

    // 1. 饿汉式指的是不管是否使用都会创建单例类的实例对象
    // 2. 因为是饿汉式，getInstance 方法只会返回当前实例
    // 3. 如何能预先创建好实例对象？答案静态代码块，类加载的时候执行
    // 4. 由于使用静态代码块初始化实例对象，进会发生一次，饿汉式天生就是线程安全的

    // 写法一
    private static final Eager INSTANCE;

    static {
        INSTANCE = new Eager();
    }

    // 写法二
    // private static final Eager INSTANCE = new Eager();;

    private Eager() {
    }
    
    public static Eager getInstance() {
        
        return INSTANCE;
    }
    
}


/**
 * Test
 */
class EagerTest {
    public static void main(String[] args) {
        
        Eager l1 = Eager.getInstance();

        Eager l2 = Eager.getInstance();

        System.out.println(l1 == l2);

        System.out.println(l1.hashCode() == l2.hashCode());
    }
}
