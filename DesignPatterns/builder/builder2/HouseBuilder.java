package DesignPatterns.builder.builder2;

public abstract class HouseBuilder {

    protected String name; // 房子的名字
    protected String style; // 房子的风格
    protected boolean hasLift = false; // 房子是否有电梯
    protected String color; // 房子的颜色

    public abstract void design();
    public abstract void build();
    public abstract void lift();
    public abstract void decorate();
    public abstract House buildHouse();
}
