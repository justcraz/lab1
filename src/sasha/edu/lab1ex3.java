package sasha.edu;

import java.util.*;

public class lab1ex3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введіть довжину масиву: ");
        int size = input.nextInt();
        int[] arr = new int[size];

        for(int i=0; i<arr.length; i++) {
            arr[i] = -100 + (int)(Math.random() * ((100 - -100) + 1));
        }

        int less7 = 0;
        int sum = 0;

        for(int x : arr) {
            if(x < 7) {
                less7++;
            }
            if(x > 0) {
                sum += x;
            }
        }
        for(int x : arr) {
            System.out.println(x);
        }

        System.out.println("Less7: "+ less7 +"\nSum: "+ sum);

    }

}