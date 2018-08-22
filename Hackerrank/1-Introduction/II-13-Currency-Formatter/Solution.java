import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double payment = scanner.nextDouble();

        NumberFormat formatter;

        formatter = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("US: " + formatter.format(payment));

        formatter = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        System.out.println("India: " + formatter.format(payment));

        formatter = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println("China: " + formatter.format(payment));

        formatter = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("France: " + formatter.format(payment));
    }
}