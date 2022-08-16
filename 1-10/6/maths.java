/*
Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5 
*/

// import java.util.Scanner;

// public class maths{
//     public static void main(String[] args){
//     Scanner input = new Scanner(System.in);

//     // Intaking the first number
//     System.out.print("Enter the first number here: ");
//     int num1 = input.nextInt();

//     // Intaking the second number
//     System.out.print("Enter the second number here: ");
//     int num2 = input.nextInt();

//     System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
//     System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
//     System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
//     System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
//     System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2));
//     }
// }

// Other version
import java.util.Scanner;

public class maths{
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);

    // Asking for the first number
    System.out.print("Enter the first number here: ");
    int num1 = input.nextInt();

    // Asking for the second number here
    System.out.print("Enter the second nymber here: ");
    int num2 = input.nextInt();

    // The sum
    int sum = num1 + num2;
    // Subtraction
    int sub = num1 - num2;
    // Multiplication
    int mult = num1 * num2;
    // Divide
    int divide = num1 / num2;
    // Mod
    int mod = num1 % num2;

    System.out.printf("Sum = %d\nMinus = %d\nMultiplication = %d\nDivision = %d\nMod = %d\n" , sum, sub, mult, divide, mod);
    }
}