package DesignPatterns.bridge;

public class LocalReader implements Reader {
    @Override
    public void read() {
        System.out.println("Reading from local file");
    }
}
