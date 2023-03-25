package day20;

import java.util.Scanner;

public class Day20 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        String[] input = scan.nextLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        
        int totalNumberOfSwaps = 0;
        for (int i = 0; i < arr.length; i++) {
            // Track number of elements swapped during a single array traversal
            int numberOfSwaps = 0;
            for (int j = 0; j < arr.length - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (arr[j] > arr[j + 1]) {
                    int saveData = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = saveData;
                    numberOfSwaps++;
                    totalNumberOfSwaps++;
                }
            }

            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }
        System.out.println("Array is sorted in " + totalNumberOfSwaps + " swaps.");
        System.out.println("First Element: " + arr[0]);
        System.out.println("Last Element: " + arr[arr.length - 1]);
    }
}

