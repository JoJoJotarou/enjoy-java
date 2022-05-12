package DesignPatterns.decorator;

public class Italic extends TextOperationDecorator {

    public Italic(TextOperation textOperation) {
        super(textOperation);
    }

    @Override
    public String format(String text) {
        return "<i>" + textOperation.format(text) + "</i>";
    }
    
}
