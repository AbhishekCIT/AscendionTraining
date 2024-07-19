package labEx1;

import java.util.Arrays;
import java.util.Scanner;

public class LabEx1_6 {
    
    private int[] array = new int[10];

    public void acceptNumbers() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
    }

    public void displayNumbersFor() {
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public void displayNumbersWhile() {
        int i = 0;
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println();
    }

    public void sortArray() {
        Arrays.sort(array);
    }

    public int countOccurrences(int number) {
        int count = 0;
        for (int value : array) {
            if (value == number) {
                count++;
            }
        }
        return count;
    }

    public void insertNumberAt(int number, int position) {
        if (position < 0 || position >= array.length) {
            System.out.println("Invalid position");
            return;
        }
        array[position] = number;
    }

    public int[] getArrayWithoutDuplicates() {
        Arrays.sort(array);


        int newSize = removeDuplicates(array, array.length);

        int[] result = new int[newSize];
        for(int i = 0; i < newSize; i++) {
            result[i] = array[i];
        }

        return result;
    }

    public static int removeDuplicates(int[] arr, int length) {
        if (length == 0 || length == 1) {
            return length;
        }
        int j = 0;

        for (int i = 0; i < length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }

        arr[j++] = arr[length - 1];

        return j;
    }

    public static void main(String[] args) {
        LabEx1_6 store = new LabEx1_6();
        store.acceptNumbers();
        store.displayNumbersFor();
        store.displayNumbersWhile();
        store.sortArray();
        store.displayNumbersFor();

        int numberToCount = 2;
        System.out.println("Occurrences of " + numberToCount + ": " + store.countOccurrences(numberToCount));

        store.insertNumberAt(99, 4);
        store.displayNumbersFor();

        int[] noDuplicates = store.getArrayWithoutDuplicates();
        System.out.println("Array without duplicates: "+Arrays.toString(noDuplicates));
    }
    
}
