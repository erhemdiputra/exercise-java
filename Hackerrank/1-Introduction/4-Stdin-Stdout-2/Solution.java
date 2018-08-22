import java.util.Scanner;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int a = scanner.nextInt();
        double b = scanner.nextDouble();
        scanner.nextLine();
        String c = scanner.nextLine();

        System.out.println("String: " + c);
        System.out.println("Double: " + b);
        System.out.println("Int: " + a);
    }
}