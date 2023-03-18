
package day7;

import java.util.Scanner;

public class Day7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nValores = scan.nextInt();
        scan.nextLine();
        String input = scan.nextLine();
        String[] miArreglo = input.split(" ");
        
        for (int i = nValores - 1; i >= 0; i--) {
            System.out.print(miArreglo[i] + " ");
        }
    }
    
}
