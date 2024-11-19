import java.util.Scanner;
public class sum {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = scanner.nextInt();
        System.out.println("Enter the second number:");
        int b = scanner.nextInt();
        System.out.println("The Sum of " + a + " and "+ b + " is "+ (a+b));
        scanner.close();
    }
}
