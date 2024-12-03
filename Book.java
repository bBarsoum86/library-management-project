public class Book extends LibraryItem {
    private int numPages;

    // Constructor
    public Book(String title, String author, int yearPublished, int itemID, int numPages) {
        super(title, author, yearPublished, itemID);  // Call parent constructor
        this.numPages = numPages;
    }

    // Override displayInfo to include numPages
    @Override
    public void displayInfo() {
        super.displayInfo();  // Call parent class displayInfo
        System.out.println("Number of Pages: " + numPages);
    }

    @Override
    public void displaySpecificInfo() {
        System.out.println("This is a book.");
    }
}

