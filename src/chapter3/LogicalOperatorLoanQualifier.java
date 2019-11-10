package chapter3;

import java.util.Scanner;

public class LogicalOperatorLoanQualifier {

    public static void main(String args[]){

        //Known values
        int salaryRequired = 30000;
        int yearsEmployedRequired = 2;

        //Unknown values
        System.out.println("Enter your salary: ");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of employment years: ");
        double years = scanner.nextDouble();

        scanner.close();

        //Make decision
        if(salary >= salaryRequired && years >= yearsEmployedRequired) {
                System.out.println("Congrats! You've qualified for the loan");
            }
        else {
            System.out.println("Sorry, your salary must be minimum "
                    + salaryRequired + " or higher and you must work minimum " +
                    + yearsEmployedRequired + " years");
             }
    }
}
