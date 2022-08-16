/*
Write a Java program that takes two numbers as input and display the product of two numbers
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125 
*/

import java.util.Scanner;

public class productOfNumbers {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Asking for the first number
    System.out.print("Enter the first number here: ");
    int num1 = input.nextInt();

    // Asking for the second number
    System.out.print("Enter the second number here: ");
    int num2 = input.nextInt();

    System.out.println(num1 + " x " + num2 + " = " + num1 * num2);

    input.close();
    }
}