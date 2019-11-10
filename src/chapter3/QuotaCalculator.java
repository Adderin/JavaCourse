package chapter3;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String args[]){
        int quota = 10;

        System.out.println("How many sales did the employee make this week? ");
        Scanner scanner = new Scanner(System.in);
        int salesNumber = scanner.nextInt();
        scanner.close();

        if(salesNumber >= quota)
            System.out.println("Congrats! You've met the quota!");

        else {
            int salesShort = quota - salesNumber;
            System.out.println("You did not make the quota. You were " + salesShort + " sales short.");
        }
    }
}
