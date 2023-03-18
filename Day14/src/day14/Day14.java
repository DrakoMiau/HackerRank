package day14;

import java.util.Scanner;

class Difference {

    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference() {
        int temporalMaxDifference = 0;
        int difference;
        for (int i = 0; i < elements.length - 1; i++) {
            for (int j = i; j < elements.length - 1; j++) {
                difference = elements[i] - elements[j + 1];
                if (difference >= 0 ) {
                    if (difference >= temporalMaxDifference) {
                        temporalMaxDifference = difference;
                    }

                } else if (difference * -1 >= temporalMaxDifference) {
                    temporalMaxDifference = difference * -1;
                }
            }
        }
        this.maximumDifference = temporalMaxDifference;
    }

}

public class Day14 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        scan.close();

        Difference difference = new Difference(arr);
        
        difference.computeDifference();
        
        System.out.println(difference.maximumDifference);
    }

}
