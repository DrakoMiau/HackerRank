
package day4;

import java.util.Scanner;

public class Day4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t;
        int age;
        t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            age = scan.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.print("\n");
        }
    }
    
}
