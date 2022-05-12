package DesignPatterns.bridge;

public class NetReader implements Reader{
    @Override
    public void read() {
        System.out.println("read from net");        
    }
}
