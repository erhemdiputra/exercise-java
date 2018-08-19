import java.util.Scanner;
import java.lang.Math;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();

        for (int i = 0; i < testCase; i++) {
            try {
                long x = scanner.nextLong();
                System.out.println(x + " can be fitted in:");

                double val8bit = Math.pow(2, 7);
                double val16bit = Math.pow(2, 15);
                double val32bit = Math.pow(2, 31);
                double val64bit = Math.pow(2, 63);


                if (x >= (-1 * val8bit) && x <= (val8bit-1)) System.out.println("* byte"); 
                if (x >= (-1 * val16bit) && x <= (val16bit - 1)) System.out.println("* short");
                if (x >= (-1 * val32bit) && x <= (val32bit - 1)) System.out.println("* int");
                if (x >= (-1 * val64bit) && x <= (val64bit - 1)) System.out.println("* long");

            } catch(Exception e) {
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }
        }
    }
}