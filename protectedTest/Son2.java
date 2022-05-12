package protectedTest;


import protectedTest.sub.Father;
import protectedTest.sub.Son1;

public class Son2 extends Father {

    public static void main(String[] args) {
        // Son1 son1 = new Son1();
        // son1.getName(); // ❌ not visible: Son1没重写任何方法，实际上调用都是Father.getName的，Son2与Father 不同包，所以不可见
        // son1.getAge(); // ❌ not visible: Son1 是可见 Father.getAge的，但是Son1没重写任何方法，实际上调用都是Father.getAge的，Son2与Father 不同包，所以不可见
        // son1.getSex(); // ✅ visible：因为是 public 修饰的

        // Son2 son2 = new Son2();
        // son2.getName(); // ✅ visible，因为是这子类，且在本类中访问
        // son2.getAge(); // ❌ not visible：Father与Son2不在同一个包，所以不可见
        // son2.getSex(); // ✅ visible

        // Son3 son3 = new Son3();
        // son3.getName(); // ✅ visible，Son3重写了getName方法，实际上调用是Son3.getName的，Son2与Son3 同包，所以可见
        // son3.getAge(); // ❌ not visible：Father与Son3不在同一个包，所以不可见
        // son3.getSex(); // ✅ visible

        // Father f = new Father();
        // f.getName(); // ❌ not visible： Son2与Father 不同包，所以可见
        // f.getAge(); // ❌ not visible：Son2与Father 不同包，所以可见
        // f.getSex(); // ✅ visible
    }
}
