package chapter3;

import java.util.Scanner;

/*
* NESTED IF
* To qualify for a loan, a person must make at least 30000
* and have been working at their current job for at least 3 years.
 */
public class LogicalOperatorLoanQualifier {

    public static void main(String args []) {

        // Initialize values
        int requiredSalary          = 30000;
        int requriedYearsEmployed  = 3;

        // Get values what we don't
        System.out.println("Enter your salary:");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();
        System.out.println("Enter number of years with current employer:");
        double years = scanner.nextDouble();

        //Make Decision
        if((salary >= requiredSalary ) &&(years >= requriedYearsEmployed )) {
                System.out.println("Congrats, you are eligible");
            }
            
        else {
            System.out.println("Sorry you must earn at least $" +requiredSalary
            +"requiredSalary");
        }
    }
}
