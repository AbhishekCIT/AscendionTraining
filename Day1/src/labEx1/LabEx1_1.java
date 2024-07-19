package labEx1;

import java.util.Scanner;

public class LabEx1_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int input1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int input2 = sc.nextInt();

        Addition addition = new Addition();

        addition.add(input1,input2);
        addition.add(input1, input2 ,30);
        addition.add(10.5,20.1);
        addition.add("Hello",20);
    }
}
