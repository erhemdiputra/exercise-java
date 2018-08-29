import java.util.Scanner;
import java.util.BitSet;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);

        while(m-- > 0) {
            String act = scanner.next();
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (act.equals("AND")) {
                if (x == 1) {
                    b1.and(b2);
                } else {
                    b2.and(b1);
                }
            } else if (act.equals("OR")) {
                if (x == 1) {
                    b1.or(b2);
                } else {
                    b2.or(b1);
                }
            } else if (act.equals("XOR")) {
                if (x == 1) {
                    b1.xor(b2);
                } else {
                    b2.xor(b1);
                }
            } else if (act.equals("FLIP")) {
                if (x == 1) {
                    b1.flip(y);
                } else {
                    b2.flip(y);
                }
            } else if (act.equals("SET")) {
                if (x == 1) {
                    b1.set(y);
                } else {
                    b2.set(y);
                }
            }

            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }
    }
}