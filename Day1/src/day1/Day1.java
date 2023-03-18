package day1;

import java.util.*;

public class Day1 {

    public static void main(String[] args) {
        
        Scanner value = new Scanner(System.in);
        ArrayList arreglo1 = new ArrayList();
        int i = 4, v1;
        double d = 4.0, v2;
        String s = "HackerRank ";
        String v3;
        v1 = value.nextInt();
        value.nextLine();
        v2 = value.nextDouble();
        value.nextLine();
        v3 = value.nextLine();

        System.out.println(i + v1);
        System.out.println(d + v2);
        System.out.println(s + v3);
    }

}
