// Write a Java program that takes three numbers as input to calculate and print the average of the numbers
// import java.util.Scanner;

// public class Average{
//     public static void main(String[] args) {
    
//     // initialize a scanner object to intakeinput
//     Scanner input = new Scanner(System.in);

//     // Taking in three numbers and storing them to figure out the average
//     System.out.println("Enter the first number here: ");
//     double num1 = input.nextInt();

//     System.out.println("Enter the second number here: ");
//     double num2 = input.nextInt();

//     System.out.println("Enter the third number here: ");
//     double num3 = input.nextInt();

//     double average = (num1 + num2+ num3) / 3;

//     // Displaying the average of the three numbers
//     System.out.println("The average of " + num1 + " , " + num2 + " , and " + num3 + " is " + average);
//     }
// }

// Doing it another way which will allow you to ask the user how many different numbers they want to average.

import java.util.Scanner;

public class Average{
    public static void main(String[] args){
        // Declaring a Scanner to use for passing in values
        Scanner input = new Scanner(System.in);

        // variables to store the values in and to know when to break out of the loop.
        double values = 0;
        double counter = 1;

        System.out.println("Input the amount of times you want to calvulate the average too: "); // prompt
        int times = input.nextInt(); // variable for the amount of times you want to enter a new number

        while(counter <= times) {
            System.out.println("Input number " + "(" + (int) counter + "): ");
            values += input.nextInt();
            counter += 1;
        }

        // Breaking out of the loop when the counter beats the times variable
        double average = (values / times);

        System.out.println("Average: " + average);

        input.close();
    }
}