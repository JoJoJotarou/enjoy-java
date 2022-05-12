package DesignPatterns.bridge;

public class PicGoDemo {
    public static void main(String[] args) {
        // 抽象类的匿名实现（没有重写任何方法）
        Picgo picgo = new Picgo(new LocalReader(), new SftpUploader()){};
        picgo.upload();
    }
}
