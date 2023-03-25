package day21;

import java.util.Scanner;

public class Day21 {

    public static <T> void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            T[] arr = (T[]) new Object[n];
            for (int i = 0; i < n; i++) {
                arr[i] = (T) scan.next();
            }
            n = scan.nextInt();
            T[] arr2 = (T[]) new Object[n];
            for (int i = 0; i < n; i++) {
                arr2[i] = (T) scan.next();
            }
            printArray(arr);
            printArray(arr2);

    }

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}
