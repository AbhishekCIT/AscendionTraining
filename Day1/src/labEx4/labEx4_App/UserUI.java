package labEx4.labEx4_App;

import java.util.Scanner;

public class UserUI {
    private Storage storage;
    Scanner scanner = new Scanner(System.in);

    public UserUI() {
        this.storage = StorageFactory.getStorage();
    }

    public void acceptEmpDetailsAndStore() {

        System.out.println("Enter Employee Number:");
        int empNo = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Enter First Name:");
        String name = scanner.nextLine();

        Employee employee = new Employee(empNo,name);
        storage.addEmployee(employee);
        System.out.println("Details are Stored");

    }

    public void displayEmpByEmpno(){

        System.out.println("Enter Employee Number to search:");
        int empNo = scanner.nextInt();

        Employee employee = storage.getEmployee(empNo);
        if (employee != null) {
            System.out.println("Employee Details : " + employee);
        } else {
            System.out.println("Employee with given Employee number not found.");
        }
    }

    public  void updateEmpDetails() {

        System.out.println("Enter Employee Number to update:");
        int empNo = scanner.nextInt();

        scanner.nextLine();

        Employee existingEmployee = storage.getEmployee(empNo);
        if (existingEmployee == null) {
            System.out.println("No Employee with this number");
            return;
        }

        System.out.println("Enter First Name:");
        String name = scanner.nextLine();

        Employee updateEmployee = new Employee(empNo , name);
        if (storage.updateEmployee(updateEmployee)){
            System.out.println("Eemployee details updated successfully");
        }
        else {
            System.out.println("Couldn't update");
        }

    }

    public void deleteEmpByEmpno() {

        System.out.println("Enter Employee Number to delete:");
        int empNo = scanner.nextInt();

        Employee existingEmployee = storage.getEmployee(empNo);
        if (existingEmployee == null) {
            System.out.println("No Employee with this number");

        } else if (storage.deleteEmployee(empNo)) {
            System.out.println("Employee Details deleted successfully");
        }

    }

}
