public abstract class LibraryItem {
    private String title;
    private String author;
    private int yearPublished;
    private int itemID;

    // Constructor
    public LibraryItem(String title, String author, int yearPublished, int itemID) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.itemID = itemID;
    }

    // Display general info for all items
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year Published: " + yearPublished);
        System.out.println("Item ID: " + itemID);
    }

    // Abstract method to be implemented by subclasses
    public abstract void displaySpecificInfo();
}

