/*
Write a Java program to divide two numbers and print on the screen.
Test Data :
50/3
Expected Output :
16 
 */

//  Original Exercise
// public class divideTwoNumbers{
//     public static void main(String[] args){
//         System.out.println(50 / 3);
//     }
// }

// Taking input from user
import java.util.Scanner;

public class divideTwoNumbers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Asking for the numerator
        System.out.print("Enter the numerator here: ");
        int numerator = input.nextInt();

        // Asking for the denominator 
        System.out.print("Enter the denominator here: ");
        int denominator = input.nextInt();

        int result = numerator / denominator;

        System.out.println();
        System.out.println(numerator + " / " + denominator + " = " + result);
        input.close();
    }
}