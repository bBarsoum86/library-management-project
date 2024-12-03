public class Magazine extends LibraryItem {
    private String issueFrequency;

    // Constructor
    public Magazine(String title, String author, int yearPublished, int itemID, String issueFrequency) {
        super(title, author, yearPublished, itemID);  // Call parent constructor
        this.issueFrequency = issueFrequency;
    }

    // Override displayInfo to include issueFrequency
    @Override
    public void displayInfo() {
        super.displayInfo();  // Call parent class displayInfo
        System.out.println("Issue Frequency: " + issueFrequency);
    }

    @Override
    public void displaySpecificInfo() {
        System.out.println("This is a magazine.");
    }
}

