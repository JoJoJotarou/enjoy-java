package DesignPatterns.bridge;

public class ImgURLUploader implements Uploader {
    @Override
    public void upload() {
        System.out.println("upload to img.url");
    }
}
