package day8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.math.*;

public class Day8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        if (1 <= n && n <= Math.pow(10, 5)) {
            String input;
            String[] valores;
            Map<String, Integer> phoneNumber = new HashMap<String, Integer>();
            for (int i = 0; i < n; i++) {
                input = scan.nextLine();
                valores = input.split(" ");
                phoneNumber.put(valores[0], Integer.parseInt(valores[1]));
            }
            String[] query = new String[n];
            try {
                for (int i = 0; i < n; i++) {
                query[i] = scan.nextLine();
                if (query[i] != "") {
                    if (phoneNumber.containsKey(query[i])) {
                        System.out.println(query[i] + "=" + phoneNumber.get(query[i]));
                    } else {
                        System.out.println("Not found");
                    }
                } else {
                    break;
                }
            }
            } catch (Exception e) {
            }
            
        } else {
            System.out.println("El numero esta fuera de rango");
        }

    }

}
