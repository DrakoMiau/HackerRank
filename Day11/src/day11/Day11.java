
package day11;

import java.util.Scanner;

public class Day11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] biDimArr = new int[6][6];
        for (int i = 0; i < 6; i++) { // creamos cada fila
            String input = scan.nextLine();  //ingreso string input
            String[] strArr = input.split(" "); // transfomo string input en cadena
            for (int j = 0; j < 6; j++) { //asignamos cada valor al arreglo bidimensional
                biDimArr[i][j] = Integer.parseInt(strArr[j]);
            }
        }
        int sumaMayor = -63;
        int sumaTemporal;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sumaTemporal = biDimArr[i][j]+biDimArr[i][j+1]+biDimArr[i][j+2]+biDimArr[i+1][j+1]+biDimArr[i+2][j]+biDimArr[i+2][j+1]+biDimArr[i+2][j+2];
                if (sumaTemporal > sumaMayor) {
                    sumaMayor = sumaTemporal;
                }
            }
        }
        System.out.println(sumaMayor);
        
    }
    
}
