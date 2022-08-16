// Write a Java program to print the sum of two numbers. 
/*
Test Data:
74 + 36
Expected Output :
110
*/

// Original
// public class sumOfTwoNumbers{
//     public static void main(String[] args) {
//         System.out.println(74 + 36);
//     }
// }

// Taking input from the user
import java.util.Scanner;

public class sumOfTwoNumbers {
    public static void main(String[] args){
    // Making a scanner for input
    Scanner input = new Scanner(System.in);
    
    // Taking in the first number
    System.out.print("Enter the first number here: ");
    int firstNum = input.nextInt();

    // Taking in the second number
    System.out.print("Enter the second number here: ");
    int secondNum = input.nextInt();

    // Storing firstNum and secondNum into a variable
    int sum = firstNum + secondNum;

    // Displaying the sums
    System.out.println();
    System.out.println(firstNum + " + " + secondNum + " = " + sum);

    input.close(); 
    }
}