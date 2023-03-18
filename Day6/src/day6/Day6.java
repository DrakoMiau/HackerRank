
package day6;

import java.util.Scanner;

public class Day6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);        
        int nWords = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < nWords; i++) {
            String word = scan.nextLine();
            char[] charWord = word.toCharArray();
            pritEven(charWord);
            printOdd(charWord);
        }
        
    }
    
    public static void pritEven(char[] charWord){
        for (int i = 0; i < charWord.length; i++) {
            if (i % 2 == 0) {
                System.out.print(charWord[i]);
            }
        }
        System.out.print(" ");
    }
    
    public static void printOdd(char[] charWord){
        for (int i = 0; i < charWord.length; i++) {
            if (i % 2 != 0) {
                System.out.print(charWord[i]);
            }
        }
        System.out.print("\n");
    }
    
}
