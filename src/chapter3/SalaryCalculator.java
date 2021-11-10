package chapter3;
/*
IF Statement
All salespeople get a payment of $1000 a week.
Salesperson who exceed 10 sales get additional bonus of $250
 */

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String args[]){

        // Initialize known values
        int salary  = 1000;
        int bonus   = 250;
        int quota   = 10;

        //Get the unknown values
        System.out.println("How many sales did employee make in this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Quick detour for bonus earners
        if(sales > quota) {

            salary = salary + bonus;
        }

        //Payment
        System.out.println("The employees pay is $" + salary);
    }
}
