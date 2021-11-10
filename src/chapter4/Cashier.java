package chapter4;

/*
 * FOR LOOP:
 * Write a cashier program that will scan a given number of items and tally the cost.
 */

import java.util.Scanner;

public class Cashier {

    public static void main (String args [])
    {
        // Getting number of items from user
        System.out.println("Enter items");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();

        // Loop to get the cost of each item

        double total = 0;

        for(int i =0; i<quantity; i++) {

            System.out.println("Enter the cost of the item:");
            double price = scanner.nextDouble();

            total = total + price;
        }
        scanner.close();

        System.out.println("Your Total Cost is:" + total);

    }

}
