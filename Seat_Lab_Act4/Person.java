import java.util.Scanner;

public class Person {
    private String name; // Field to store the person's name
    private int id;      // Field to store the person's ID

    public static void main(String[] args) {
        // Use try-with-resources to automatically close the Scanner
        try (Scanner scanner = new Scanner(System.in)) {
            // Prompt the user to enter their name
            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            // Prompt the user to enter their ID
            System.out.print("Enter ID: ");
            while (!scanner.hasNextInt()) { // Check if the input is a valid integer
                System.out.println("Invalid input. Please enter a valid ID:");
                scanner.next(); // Consume invalid input
            }
            int id = scanner.nextInt();

            // Create a Person object using the user's input
            Person person = new Person(name, id);

            // Display the details of the person
            person.displayInfo();
        } // Scanner is automatically closed here
    }

    // Constructor to initialize name and id
    public Person(String name, int id) {
        this.name = name; // Set the name
        this.id = id;     // Set the ID
    }

    // Getter for name
    public String getName() {
        return name; // Return the name
    }

    // Setter for name
    public void setName(String name) {
        this.name = name; // Update the name
    }

    // Getter for id
    public int getId() {
        return id; // Return the ID
    }

    // Setter for id
    public void setId(int id) {
        this.id = id; // Update the ID
    }

    // Method to display person details
    public void displayInfo() {
        // Print the name and ID of the person
        System.out.println("Name: " + name + ", ID: " + id);
    }
}
