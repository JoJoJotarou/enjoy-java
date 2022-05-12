package DesignPatterns.builder.builder2;

public class Test {
    public static void main(String[] args) {
        Directory directory = new Directory(new VillaBuilder());
        System.out.println(directory.doBuild().toString());
    }
}
