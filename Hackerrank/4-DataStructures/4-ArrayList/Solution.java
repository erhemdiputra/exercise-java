import java.util.Scanner;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<Long>> nestedList = new ArrayList<ArrayList<Long>>();

        long N = scanner.nextLong();
        for (long i = 1; i <= N; i++) {
            long d = scanner.nextLong();
            ArrayList<Long> list = new ArrayList<Long>();

            for (long j = 1; j <= d; j++) {
                long val = scanner.nextLong();
                list.add(val);
            }

            nestedList.add(list);
        }

        int Q = scanner.nextInt();
        for (int i = 1; i <= Q; i++) {
            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1;

            try {
                long val = nestedList.get(x).get(y);
                System.out.println(val);
            } catch(Exception e) {
                System.out.println("ERROR!");
            }
        }

        scanner.close();
    }
}