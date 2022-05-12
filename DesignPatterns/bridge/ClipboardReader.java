package DesignPatterns.bridge;

public class ClipboardReader implements Reader {
    @Override
    public void read() {
        System.out.println("read from clipboard");
    }
}
