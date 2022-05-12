package DesignPatterns.decorator;

public class Word  extends TextOperation{

    @Override
    public String format(String text) {
        return text;
    }
    
}
