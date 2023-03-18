
package day10;

import java.util.Scanner;

public class Day10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String nBinary = Integer.toBinaryString(n);
        String[] binaryArr = nBinary.split("");
        int nMaxOnes = 0;
        int counter = 0;
        for (int i = 0; i < binaryArr.length; i++) {
            if (Integer.parseInt(binaryArr[i]) == 1) {
                counter++;
            } else {
                counter = 0;
            }
            if (counter > nMaxOnes) {
                nMaxOnes = counter;
            }
        }
        System.out.println(nMaxOnes);
    }
    
}
