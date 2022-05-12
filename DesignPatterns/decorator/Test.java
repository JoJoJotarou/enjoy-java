package DesignPatterns.decorator;

public class Test {

    public static void main(String[] args) {
        Word word = new Word();
        String text1 = new Bold(word).format("Hello");
        System.out.println(text1);
        String text2 = new Italic(new Bold(word)).format("Hello");
        System.out.println(text2);
    }
}
