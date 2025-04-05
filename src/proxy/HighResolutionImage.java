package proxy;

public class HighResolutionImage implements Image {
    private String filename;

    public HighResolutionImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading full image from disk: " + filename);
    }

    @Override
    public void displayThumbnail() {
        System.out.println("Showing thumbnail of: " + filename);
    }

    @Override
    public void displayFullImage() {
        System.out.println("Displaying full-resolution image: " + filename);
    }
}
