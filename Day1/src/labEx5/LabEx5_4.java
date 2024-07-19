package labEx5;

import java.util.Scanner;

public class LabEx5_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LearningModule learningModule = new LearningModule();

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        try {
            String learningCode = learningModule.getLearningCode(name, age);
            System.out.println("Generated Learning Code: " + learningCode);
        } catch (WrongInputException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
