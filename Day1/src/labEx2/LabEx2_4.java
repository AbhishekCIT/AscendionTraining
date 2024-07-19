package labEx2;

import java.util.Scanner;

public class LabEx2_4 {
    public static String word(int digit) {
        switch (digit) {
            case 0: return "Zero";
            case 1: return "One";
            case 2: return "Two";
            case 3: return "Three";
            case 4: return "Four";
            case 5: return "Five";
            case 6: return "Six";
            case 7: return "Seven";
            case 8: return "Eight";
            case 9: return "Nine";
            default: return "";
        }
    }

    public static void digitsToWords(int num) {
        if (num < 100 || num > 999) {
            System.out.println("Input is not a 3-digit number.");
            return;
        }

        int hundredsPlace = num / 100;
        int tensPlace = (num / 10) % 10;
        int unitsPlace = num % 10;

        System.out.println(word(hundredsPlace) + " " + word(tensPlace) + " " + word(unitsPlace));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        digitsToWords(number);
    }
}
