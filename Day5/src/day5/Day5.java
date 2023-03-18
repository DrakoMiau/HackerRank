package day5;

import java.util.Scanner;

public class Day5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if (2 <= n && n <= 20) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + n * i);
            }
        } else{
            System.out.println("Number out of range");
        }
    }
}
