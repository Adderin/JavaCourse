package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String args[]){
        //1. Get the number of hours worked
        System.out.println("Enter the number of hours: ");
        Scanner scan = new Scanner(System.in);
        int hours = scan.nextInt();

        //2. Get the hourly pay rate
        System.out.println("Enter the employee's pay rate: ");
        double rate = scan.nextDouble();
        scan.close();

        //3. Multiply hours and pay rate
        double grossPay = hours * rate;

        //4. Display result
        System.out.println("The Gross Pay is: $"+ grossPay);


    }
}
