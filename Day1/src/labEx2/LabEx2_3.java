package labEx2;

import java.util.Scanner;

public class LabEx2_3 {
    public static int largest(int n1, int n2, int n3) {
        int largest = n1;
        if (n2 > largest) {
            largest = n2;
        }
        if (n3 > largest) {
            largest = n3;
        }
        return largest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int largestNumber = largest(num1, num2, num3);

        System.out.println("The largest number is: " + largestNumber);
    }
}
