package calc;

import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int input1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int input2 = sc.nextInt();

        Addition addition = new Addition();
        Subtraction subtraction = new Subtraction();
        Multiplication multiplication = new Multiplication();
        Division division = new Division();
        int continueornot = 1;

        while(continueornot!=0){
            System.out.println("\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\nEnter the operator: ");
            int operator = sc.next().charAt(0);
            switch (operator) {
                case '+':
                    addition.add(input1, input2);
                    break;
                case '-':
                    subtraction.sub(input1, input2);
                    break;
                case '*':
                    multiplication.mul(input1, input2);
                    break;
                case '/':
                    division.div(input1, input2);
                    break;
                default:
                    break;
            }
            System.out.println("\nDo you wanna continue: 1- continue | 0- exit : ");
            continueornot = sc.nextInt();

        }




    }


}

class Cal2{
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int input1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int input2 = sc.nextInt();
    }
}