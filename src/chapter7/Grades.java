package chapter7;

import java.util.Scanner;

public class Grades {

    private static int grades[];
    private static Scanner scanner = new Scanner();

    public static void main(String[] args) {

        System.out.println("How many grades you would like to enter? ");
        grades = new int[scanner.nextInt()];

        getGrades();
        System.out.println("Average: " + String.format("%.2f", calculateAvg()));
    }

    public static void getGrades(){
        for(int i=0; i < grades.length; i++) {
            System.out.println("Enter grade #" + (i+1));
            grades[i] = scanner.nextInt();
        }
    }
    public static int calculateSum(){
        int sum = 0;
        for(int grade: grades){
            sum = sum + grade;
        }
        return sum;
    }
    public static double calculateAvg(){
        return calculateSum()/grades.length;
    }
}
