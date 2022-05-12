package DesignPatterns.bridge;

public class RefinedPicgo extends Picgo{
    public RefinedPicgo(Reader reader, Uploader uploader) {
        super(reader, uploader);
    }

    @Override
    public void upload() {
        reader.read();
        uploader.upload();
    }

    public void notifyUser() {
        System.out.println("notify user");
    }

    public static void main(String[] args) {
        RefinedPicgo picgo = new RefinedPicgo(new ClipboardReader(), new SftpUploader());
        picgo.upload();
        picgo.notifyUser();
    }
}
