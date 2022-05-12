package DesignPatterns.adapter.objectAdapter;

public class Test {
    public static void main(String[] args) {
        Editor editor = new Editor(new MarkdownAdapter());

        editor.show("# Hello World");
    }
}
