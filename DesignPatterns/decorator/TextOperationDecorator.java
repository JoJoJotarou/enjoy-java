package DesignPatterns.decorator;

public abstract class TextOperationDecorator extends TextOperation {

    protected TextOperation textOperation;
    
    public TextOperationDecorator(TextOperation textOperation) {
        this.textOperation = textOperation;
    }
}
