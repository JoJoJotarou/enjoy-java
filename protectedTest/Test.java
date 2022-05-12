package protectedTest;

import protectedTest.sub.Father;
import protectedTest.sub.Son1;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {

        // Son1 son1 = new Son1();
        // son1.getName(); // ❌ not visible: Son1没重写任何方法，实际上调用都是Father.getName的，Test与Father不同包，所以不可见
        // son1.getAge(); // ❌ not visible: Son1没重写任何方法，实际上调用都是Father.getAge的，Test与Father不同包，所以不可见
        // son1.getSex(); // ✅ visible：因为是 public 修饰的

        // Son2 son2 = new Son2();
        // son2.getName(); // ❌ not visible: Son2没重写任何方法，实际上调用都是Father.getName的，Test与Father不同包，所以不可见
        // son2.getAge(); // ❌ not visible： Son2 与 Father 不在同包中，所以不可见
        // son2.getSex(); // ✅ visible

        // // 除了getName，其他原因全部同上
        // Son3 son3 = new Son3();
        // son3.getName(); // ✅ visible：因为 Son3 中重写getName，使得其与 Test 在同一个包下
        // son3.getAge(); // ❌ not visible
        // son3.getSex(); // ✅ visible

        // Father f = new Son3();
        // f.getName(); // ❌ not visible：用Father接收，故这里实际看的是Father，Test与Father不同包，所以不可见
        // f.getAge(); // ❌ not visible：用Father接收，故这里实际看的是Father，Test与Father不同包，所以不可见
        // f.getSex(); // ✅ visible

        // Father f1 = new Father();
        // f1.getName(); // ❌ not visible：Test 与 Father 不同包，所以可见
        // f1.getAge(); // ❌ not visible：Test 与 Father 不同包，所以可见
        // f1.getSex(); // ✅ visible
    }
}
