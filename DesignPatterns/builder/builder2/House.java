package DesignPatterns.builder.builder2;

public class House {
    public String name; // 房子的名字
    public String style; // 房子的风格
    public boolean hasLift = false; // 房子是否有电梯
    public String color; // 房子的颜色

    public House(HouseBuilder builder) {
        this.name = builder.name;
        this.style = builder.style;
        this.hasLift = builder.hasLift;
        this.color = builder.color;
    }
}
