// Original exercise
// public class helloName {
//     public static void main(String[] args) {
//         System.out.println("Hello\nSara Bauland!");
//     }
// }

// Exercise with input from user
import java.util.Scanner;

public class helloName{
    public static void main(String[] args) {
        java.util.Scanner input = new Scanner(System.in);

        // For the first name
        System.out.print("Enter your first name here: ");
        String firstName = input.next();
        // For the last name
        System.out.print("Enter your last name here: ");
        String lastName = input.next();
        System.out.println("\nHello \n" + firstName + " " + lastName + "!");
        input.close();
    }
}

