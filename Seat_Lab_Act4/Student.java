public class Student extends Person {
    private String gradeLevel;

    // Constructor to initialize name, id, and grade level
    public Student(String name, int id, String gradeLevel) {
        super(name, id); // Call the parent constructor
        this.gradeLevel = gradeLevel;
    }

    // Override displayInfo to include grade level
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the parent displayInfo
        System.out.println("Grade Level: " + gradeLevel);
    }
}