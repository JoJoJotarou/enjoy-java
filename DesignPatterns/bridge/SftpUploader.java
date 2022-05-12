package DesignPatterns.bridge;

public class SftpUploader implements Uploader {
    @Override
    public void upload() {
        System.out.println("upload to sftp");
    }
}
