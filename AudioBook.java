public class AudioBook extends LibraryItem {
    private int audioLength;  // Length of the audiobook in minutes

    // Constructor
    public AudioBook(String title, String author, int yearPublished, int itemID, int audioLength) {
        super(title, author, yearPublished, itemID);  // Call parent constructor
        this.audioLength = audioLength;
    }

    // Override displayInfo to include audioLength
    @Override
    public void displayInfo() {
        super.displayInfo();  // Call parent class displayInfo
        System.out.println("Audio Length (in minutes): " + audioLength);
    }

    @Override
    public void displaySpecificInfo() {
        System.out.println("This is an audiobook.");
    }
}

