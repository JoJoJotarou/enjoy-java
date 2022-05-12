package DesignPatterns.decorator;

public class Bold extends TextOperationDecorator {

    public Bold(TextOperation textOperation) {
        super(textOperation);
    }

    @Override
    public String format(String text) {
        return "<b>" + textOperation.format(text) + "</b>";
    }
    
}
