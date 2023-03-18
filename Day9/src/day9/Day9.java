
package day9;

import java.util.Scanner;

public class Day9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(factorial(n));
    }
    public static int factorial(int n){
        int productoRecursivo = n;
        if (n > 1) {
            productoRecursivo = n*factorial(n-1);
        }
        return productoRecursivo;
    }
}
