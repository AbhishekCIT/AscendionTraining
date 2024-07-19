package day1;

import java.util.*;


public class Furniture {
    public static void main(String[] args) {
        Door d1 = new Door();
        d1.displayDoor();
        d1.door1();
        d1.displayDoor();
        d1.door2();
        d1.displayDoor();

        Door d2 = new Door();
        d2.displayDoor();
        d2.color="Grey";
        d2.type="PVC";
        d2.displayDoor();

        Table t1 = new Table();
        t1.displayTable();
        t1.table1();
        t1.displayTable();
        t1.table2();
        t1.displayTable();

        Table t2 = new Table();
        t2.displayTable();
        t2.color="Grey";
        t2.capacity=6;
        t2.displayTable();

        int n = 5;

        // Declaring the ArrayList with
        // initial size n
        ArrayList<Float> arr1 = new ArrayList<Float>(n);

        // Declaring the ArrayList
        ArrayList<Integer> arr2 = new ArrayList<Integer>();

        // Printing the ArrayList
        System.out.println("Array 1:" + arr1);
        System.out.println("Array 2:" + arr2);

        // Appending new elements at
        // the end of the list
        for (int i = 1; i <= n; i++) {
            arr2.add(i);
        }
        for (float i = 1; i <= n; i++) {
            arr1.add(i);

        }
        arr1.add(11f);
        arr2.add(11);
        arr1.add(12f);
        arr2.add(12);
        arr1.add(13f);
        arr2.add(13);
        // Printing the ArrayList
        System.out.println("Array 1:" + arr1);
        System.out.println("Array 1:" + arr1.toArray().length);
    }
}
