import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        //take in two integers from the command line
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter three int: ");
        int int1 = scan.nextInt();
        int int2 = scan.nextInt();
        int int3 = scan.nextInt();
        //print out the values entered
        System.out.println("You entered: " + int1 + ", " + int2 + " and " + int3);
        scan.close();
    }
}
