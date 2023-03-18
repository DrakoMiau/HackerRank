
package day16;

import java.util.Scanner;

public class Day16 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int value;
        try {
            value = Integer.parseInt(s);
            System.out.println(value);
        } catch (Exception e) {
            System.out.println("Bad String");
        }     
        
    }
}
