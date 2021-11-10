package chapter3;

import java.util.Scanner;

/*
* IF ELSE
* All salespersons are expected to make at least 10 sales in a week.
* For those who do, they receive a congratulatory message.
* For those who do not, they are informed of how many sales they were short.
 */
public class QuotaCalculator {

    public static void main (String args[]) {

        //Initialize
        int quota = 10;

        //Get unknown
        System.out.println("Enter the number of sales you made this week:");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Make a decision on the path to take - output
        if ( sales > quota ) {
            System.out.println("Congratulations!");
        }
        else {
            int salesShort = quota - sales;
            System.out.println("You did not make your quota. You were" +salesShort + "salesShort" );
        }

    }


}
