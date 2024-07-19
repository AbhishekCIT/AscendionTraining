package labEx1;

import java.util.Scanner;

public class LabEx1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        forLoop(num);
        whileLoop(num);
        doWhileLoop(num);
    }
    static void forLoop(int n){
        for(int i = 1; i<=10 ; i++){
            System.out.println(n+" x "+i+" = "+(n*i));
        }
        System.out.println();
    }
    static void whileLoop(int n){
        int i = 1;
        while(i<=10){
            System.out.println(n+" x "+i+" = "+(n*i));
            i++;
        }
        System.out.println();
    }
    static void doWhileLoop(int n){
        int i=1;
        do{
            System.out.println(n+" x "+i+" = "+(n*i));
            i++;
        }while(i<=10);
        System.out.println();
    }
}
