package DesignPatterns.bridge;

public abstract class Picgo {
    protected Reader reader;
    protected Uploader uploader;

    public Picgo(Reader reader, Uploader uploader) {
        this.reader = reader;
        this.uploader = uploader;
    }

    public void upload() {
        reader.read();
        uploader.upload();
    }
}
