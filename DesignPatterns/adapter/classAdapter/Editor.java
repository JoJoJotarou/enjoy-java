package DesignPatterns.adapter.classAdapter;

public class Editor {
    private IParse parse;

    public Editor(IParse parse) {
        this.parse = parse;
    }

    public void show(String text) {
        System.out.println("编辑器仅显示HTML: " + this.parse.parseH1(text));
    }
}
