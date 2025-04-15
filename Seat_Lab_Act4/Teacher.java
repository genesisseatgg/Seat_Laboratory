public class Teacher extends Person {
    private String subject;

    // Constructor to initialize name, id, and subject
    public Teacher(String name, int id, String subject) {
        super(name, id); // Call the parent constructor
        this.subject = subject;
    }

    // Override displayInfo to include subject
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the parent displayInfo
        System.out.println("Subject: " + subject);
    }
}