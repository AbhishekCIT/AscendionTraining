package labEx4.labEx4_App;

import java.util.Scanner;

public class LabEx4_App {
    public static void main(String[] args) {
        UserUI userUI = new UserUI();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("1. Add Employee Details");
            System.out.println("2. Display Employee by Number");
            System.out.println("3. Update Employee Details");
            System.out.println("4. Delete Employee by Number");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    userUI.acceptEmpDetailsAndStore();
                    break;
                case 2:
                    userUI.displayEmpByEmpno();
                    break;
                case 3:
                    userUI.updateEmpDetails();
                    break;
                case 4:
                    userUI.deleteEmpByEmpno();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }


        }
    }
}



//class InvalidAgeExceptio extends Exception{
//
//}