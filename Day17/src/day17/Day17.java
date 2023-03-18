package day17;

import java.util.Scanner;

class NegativeNumberException extends Exception {

}

class Calculator {

    public static int power(int n, int p) throws NegativeNumberException {
        if (n < 0 || p < 0) {
            throw new NegativeNumberException();
        } else {
            return (int) Math.pow(n, p);
        }
    }
}

public class Day17 {

    public static void main(String[] args) throws NegativeNumberException{
        Scanner scan = new Scanner(System.in);
        int nValues = scan.nextInt();
        scan.nextLine();
        
        for (int i = 0; i < nValues; i++) {
            String input = scan.nextLine();
            String[] arrValues = input.split(" ");
            try {
                System.out.println(Calculator.power(Integer.parseInt(arrValues[0]), Integer.parseInt(arrValues[1])));
            } catch (NegativeNumberException e1) {
                System.out.println("n and p should be non-negative");
            }
            
        }
    }

}
