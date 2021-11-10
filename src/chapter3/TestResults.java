package chapter3;

import java.util.Scanner;

/*
* IF ELSE IF
*
 */
public class TestResults {

    public static void main(String args []) {

        // Get the score
        System.out.println("Enter your test score");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        scanner.close();

        // Determine the grade
        char grade;

        if ( score < 60) {
            grade = 'F';
             }
        else  if (score <70 ){
            grade = 'D';
        }
        else if (score < 80){
            grade = 'B';
        }
        else {
            grade = 'A';
        }

        System.out.println("Your grade is:" + grade);
    }
}
