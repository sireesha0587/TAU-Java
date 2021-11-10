package chapter5;

import java.util.Scanner;

/*
* OUR FIRST METHOD
* Write a method to asks user for their name, greet them
 */
public class Greetings {

    public static void main(String args[]){

        System.out.println("Enter user name:");
        Scanner scanner = new Scanner(System.in);
        String name     = scanner.next();
        scanner.close();
        greetUser(name);

    }

    public static void greetUser(String name) {
        System.out.println("Hi There:" + name);
    }
}
