package exceptionHandling;

import java.util.Scanner;

public class AException {
    public static void main(String[] args) {
        System.out.println("Arithmetic Exception");
        Scanner sc = new Scanner(System.in);
        int num1 = 10; int num2 = sc.nextInt();
        try {
            int result = num1 / num2;
            System.out.println(result);
        }
        catch (RuntimeException e){
            System.out.println("Arithmetic Exception "+ e);
        }

    }
}
