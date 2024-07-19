package day1;

import java.util.Arrays;

public class ArrayEx {
    public static void main(String[] args){
        char[] consonants ={'b','z','k','d','v'};

        Arrays.sort(consonants);

        for(int i =0; i< consonants.length;i++){
            System.out.println(consonants[i]);
        }
    }
}
