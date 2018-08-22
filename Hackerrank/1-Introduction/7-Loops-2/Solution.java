import java.util.Scanner;
import java.lang.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N  = scanner.nextInt();
        for (int i = 1; i <= N; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            int[] res = Process(a, b, n);
            for (int j = 1; j <= n; j++) {
                System.out.printf("%d", res[j]);

                if(j == n) {
                    System.out.printf("%n");
                } else {
                    System.out.printf(" ");
                }
            }
        }
    }

    public static int[] Process(int a, int b, int n)  {
        int[] list = new int[50];
        list[0] = a;

        for (int i = 1; i <= n; i++) {
            list[i] += list[i-1] + ( Math.pow(2, i-1) * b );
        }

        return list;
    }
}

