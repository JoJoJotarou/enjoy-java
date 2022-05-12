package DesignPatterns.builder.builder1;

public class SkyscraperBuilder extends HouseBuilder {
    @Override
    public void design() {
        System.out.println("skyscraper design");
        this.name = "A大厦";
    }
    @Override
    public void build() {
        System.out.println("skyscraper build");
        this.style = "英伦风";
    }
    
    @Override
    public void lift() {
        this.hasLift = true;
    }
    @Override
    public void decorate() {
        System.out.println("skyscraper decorate");
        this.color = "蓝色";
    }
    @Override
    public House buildHouse() {
        return new House(this.name, this.style, this.hasLift, this.color);
    }
}
