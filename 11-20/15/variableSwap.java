// Write a Java program to swap two variables.

// Original way with 3 variables
// public class variableSwap{
//     public static void main(String[] args) {
//         // declare the variables for the two variables
//         int x = 10;
//         int y = 20;

//         System.out.println("Before the swap");
//         System.out.println("Variable x = " + x);
//         System.out.println("Variable y = " + y);

//         // Now to swap the variables
//         // storing x in a temp variable
//         int temp = x;
//         // swapping y over to x
//         x = y;
//         // moving x into y since we stored x in temp
//         y = temp;

//         System.out.println("\nAfter the swap");
//         System.out.println("Variable x = " + x);
//         System.out.println("Variable y = " + y);        
//     }
// }

// Without using a 3rd variable
// public class variableSwap{
//     public static void main(String[] args) {
//         int x = 10, y = 20;

//         System.out.println("Before swapping \nx = " + x + "\ny = " + y);

//         // swapping them without any variables other than x and y 
//         x = x + y; //setting x to 30
//         // System.out.println(x);
//         y = x - y; // setting y to 10 which is x before
//         // System.out.println(y);
//         x = x - y; // setting x to 20 which is y before
//         // System.out.println(x);

//         System.out.println("After swapping \nx = " + x + "\ny = " + y);
//     }
// }

// While intaking input from the user
import java.util.Scanner;
public class variableSwap {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        // Variables for the swap
        int x, y;

        // asking for the numbers
        System.out.println("Enter the first number here: "); // prompt
        x = input.nextInt(); // storing the selected number in x
        System.out.println("Enter the second number here: "); // prompt
        y = input.nextInt(); // storing the selected number into y

        System.out.println("Before swapping: \nx = " + x +"\ny = " + y);

        // Swap the variables out here
        x = x + y; // Changing x
        // making y what x was
        y = x - y;
        // making x what y was
        x = x - y;

        System.out.println("After swapping: \nx = " + x +"\ny = " + y);

        input.close();
    }
}