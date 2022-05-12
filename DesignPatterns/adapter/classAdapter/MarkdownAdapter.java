package DesignPatterns.adapter.classAdapter;

public class MarkdownAdapter extends HTMLSyntax implements IParse {
    @Override
    public String parseH1(String text) {
        System.out.println("markdown转换为html......");
        return this.H1(text.replace("# ", ""));
    }
}
