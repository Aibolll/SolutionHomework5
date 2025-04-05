package proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        Image image = new ImageProxy("house1.jpg");

        image.displayThumbnail();       // Fast
        image.displayFullImage();       // Lazy load

        ImageUploader uploader = new ImageUploader(false);
        uploader.uploadImage("newHouse.jpg"); // Access denied

        ImageUploader loggedInUploader = new ImageUploader(true);
        loggedInUploader.uploadImage("modernVilla.jpg"); // Successful
    }
}
