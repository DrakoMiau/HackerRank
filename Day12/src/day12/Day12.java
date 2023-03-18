package day12;

import java.util.Scanner;

class Person {
    //atributos

    protected String firstName;
    protected String lastName;
    protected int idNumber;

    //Constructor
    /*public Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }*/
    //metodo imprimir persona

    public void printPerson() {
        System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
    }

}

//clase Student que hereda de Person
class Student extends Person {

    private int[] testScores;

    public Student(String firstName, String lastName, int idNumber, int[] scores) {
        testScores = new int[scores.length];
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        for (int i = 0; i < scores.length; i++) {
            this.testScores[i] = scores[i];
        }

    }

    public char calculate() {  //se calcula el promedio y se retorna la nota
        char grade;
        double averageScore;
        int sumScores = 0;
        for (int i = 0; i < this.testScores.length; i++) {
            sumScores = sumScores + testScores[i];
        }
        averageScore = sumScores / testScores.length;
        if (90 <= averageScore && averageScore <= 100) {
            return grade = 'O';
        } else if (80 <= averageScore && averageScore < 90) {
            return grade = 'E';
        } else if (70 <= averageScore && averageScore < 80) {
            return grade = 'A';
        } else if (55 <= averageScore && averageScore < 70) {
            return grade = 'P';
        } else if (40 <= averageScore && averageScore < 550) {
            return grade = 'D';
        } else if (averageScore < 40) {
            return grade = 'T';
        }
        return grade = 'g';
    }
}

public class Day12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] datos = input.split(" ");
        int nNotas = scan.nextInt();
        int[] notas = new int[nNotas];
        for (int i = 0; i < nNotas; i++) {
            notas[i] = scan.nextInt();
        }
        Student estudiante1 = new Student(datos[0], datos[1], Integer.parseInt(datos[2]), notas);
        estudiante1.printPerson();
        System.out.println("Grade: " + estudiante1.calculate());

    }

}
