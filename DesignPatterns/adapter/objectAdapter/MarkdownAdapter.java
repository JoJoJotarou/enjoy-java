package DesignPatterns.adapter.objectAdapter;

public class MarkdownAdapter implements IParse {
    // 这里是组成，也可使用聚合
    private HTMLSyntax htmlSyntax = new HTMLSyntax();
    
    @Override
    public String parseH1(String text) {
        System.out.println("markdown转换为html......");
        return htmlSyntax.H1(text.replace("# ", ""));
    }
}
