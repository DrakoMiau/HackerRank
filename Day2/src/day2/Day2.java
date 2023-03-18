
package day2;

import java.util.Scanner;
import java.lang.Math;

public class Day2 {

    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        double mealCost;
        int tipPercent, taxPercent;
        mealCost = scan.nextDouble();
        tipPercent = scan.nextInt();
        taxPercent = scan.nextInt();
        solve(mealCost, tipPercent,taxPercent);
    }
    
    private static void solve(double mealCost, int tipPercent, int taxPercent){
        double tipPrice = mealCost*tipPercent/100, taxPrice = mealCost*taxPercent/100;
        double finalPrice = mealCost + tipPrice + taxPrice;
        System.out.println(Math.round(finalPrice));
    }
}
