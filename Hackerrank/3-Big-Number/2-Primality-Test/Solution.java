import java.util.Scanner;
import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        boolean prime = new BigInteger(s).isProbablePrime(1);
        String res = prime ? "prime" : "not prime";
        System.out.println(res);
    }
}