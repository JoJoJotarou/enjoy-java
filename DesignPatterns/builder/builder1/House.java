package DesignPatterns.builder.builder1;

public class House {
    public String name; // 房子的名字
    public String style; // 房子的风格
    public boolean hasLift = false; // 房子是否有电梯
    public String color; // 房子的颜色

    public House(){}

    public House(String name, String style, boolean hasLift, String color) {
        this.name = name;
        this.style = style;
        this.hasLift = hasLift;
        this.color = color;
    }

    @Override
    public String toString() {
        return "House [color=" + color + ", hasLift=" + hasLift + ", name=" + name + ", style=" + style + "]";
    }

}
