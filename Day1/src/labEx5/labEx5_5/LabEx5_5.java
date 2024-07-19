package labEx5.labEx5_5;



import java.util.Scanner;

public class LabEx5_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Storage storage = new EmployeeStorage();

        while (true) {
            System.out.println("1. Add Employee");
            System.out.println("2. Get Employee");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter Employee Name: ");
                    String name = scanner.nextLine();
                    try {
                        storage.addEmployee(new Employee(id, name));
                        System.out.println("Employee added successfully.");
                    } catch (EmployeeAlreadyExistsException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("Enter Employee ID: ");
                    int searchId = scanner.nextInt();
                    try {
                        Employee employee = storage.getEmployee(searchId);
                        System.out.println("Employee found: " + employee.getName());
                    } catch (EmployeeNotFoundException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 3:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
