import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        //take in two integers from the command line
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter two int: ");
        int int1 = scan.nextInt();
        int int2 = scan.nextInt();
        //print out the values entered
        // System.out.println("You entered: " + int1 + " and " + int2);
        int multiply = int1 * int2;
        System.out.println("\n" + multiply);
        scan.close();
    }
}
