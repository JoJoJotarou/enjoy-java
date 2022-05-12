package protectedTest.sub;

import protectedTest.Son2;
import protectedTest.Son3;
import protectedTest.sub.Father;
import protectedTest.sub.Son1;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {

        // Son1 son1 = new Son1();
        // son1.getName(); // ✅ visible：Son1没重写任何方法，实际上调用都是Father.getName的，Test与Father同包，所以可见
        // son1.getAge(); // ✅ visible：Son1没重写任何方法，实际上调用都是Father.getAge的，Test与Father同包，所以可见
        // son1.getSex(); // ✅ visible：因为是 public 修饰的，任何人可见的

        // // 原因全部同上
        // Son2 son2 = new Son2();
        // son2.getName(); // ✅ 调用者Test与被调用者Son2的方法在同一个包下（Son2并没有自己getName是继承的，实际上还是调用Father.getName）
        // son2.getAge(); // ❌ not visible：Father 与 Son2 不同包，所以不可见
        // son2.getSex(); // ✅ visible

        // // 除了getName，其他原因全部同上
        // Son3 son3 = new Son3();
        // son3.getName(); // ❌ not visible：因为 Son3 中重写getName，那么调用就是Son3.getName，Son3 与Test不同包，所以不可见
        // son3.getAge(); // ❌ not visible：Father 与 Son3 不同包，所以不可见
        // son3.getSex(); // ✅ visible

        // Father f = new Son3();
        // f.getName(); // ✅ visible：由于用Father接收Son3，故这里实际看的是Father, Test 与 Father 同包，所以可见
        // f.getAge(); // ✅ visible：由于用Father接收Son3，故这里实际看的是Father, Test 与 Father 同包，所以可见
        // f.getSex(); // ✅ visible

        // Father f1 = new Father();
        // f1.getName(); // ✅ visible：Test 与 Father 同包，所以可见
        // f1.getAge(); // ✅ visible：Test 与 Father 同包，所以可见
        // f1.getSex(); // ✅ visible
    }
}
