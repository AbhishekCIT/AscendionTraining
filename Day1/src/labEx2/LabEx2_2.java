package labEx2;

import java.util.Scanner;

public class LabEx2_2 {
    public static String message(String name) {
        return "Hello " + name + ", Welcome to Java World!";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String message = message(name);
        System.out.println(message);
    }
}
