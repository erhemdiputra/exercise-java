import java.util.Scanner;
import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        BigInteger biA = new BigInteger(a);
        BigInteger biB = new BigInteger(b);

        System.out.println(biA.add(biB));
        System.out.println(biA.multiply(biB));
    }
}