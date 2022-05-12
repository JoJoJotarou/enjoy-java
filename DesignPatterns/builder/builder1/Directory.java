package DesignPatterns.builder.builder1;

public class Directory {

    private HouseBuilder houseBuilder;

    public Directory(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House doBuild() {
        this.houseBuilder.design();
        this.houseBuilder.build();
        this.houseBuilder.decorate();

        return this.houseBuilder.buildHouse();
    }
}
