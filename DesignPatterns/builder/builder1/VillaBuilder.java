package DesignPatterns.builder.builder1;

public class VillaBuilder extends HouseBuilder {
    @Override
    public void design() {
        System.out.println("villa design");
        this.name = "幸福一家";
    }
    @Override
    public void build() {
        System.out.println("villa build");
        this.style = "中国风";
    }
    @Override
    public void lift() {}
    @Override
    public void decorate() {
        System.out.println("villa decorate");
        this.color = "灰色";
    }
    @Override
    public House buildHouse() {
        return new House(this.name, this.style, this.hasLift, this.color);
    }
}
