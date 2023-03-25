package day21;

import java.util.Scanner;

public class Day21 {

    public static <T> void main(String[] args) {
        for (int j = 0; j < 2; j++) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            T[] arr = (T[]) new Object[n];
            for (int i = 0; i < n; i++) {
                arr[i] = (T) scan.next();
            }
            printArray(arr);
        }

    }

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}
