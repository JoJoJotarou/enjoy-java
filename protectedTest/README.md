
# protectedTest 目录下的代码测试什么的？

是为了证明：`protected` 修饰的方法或者属性，若使用地方与该类不在同一个包下是不能访问，即使有相同的父类。

`protectedTest.sub.Father` 有2个继承这 `protectedTest.sub.Son1` 和 `protectedTest.Son` 的子类，但是想在 `Son` 中调用 `Son1` 的 `protected` 方法是不行的。
