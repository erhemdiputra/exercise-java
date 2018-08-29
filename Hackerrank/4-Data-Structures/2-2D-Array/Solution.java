import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 6;
        int[][] arr = new int[6][6];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < (N-2); i++) {
            for (int j = 0; j < (N-2); j++) {
                int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + 
                arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];

                if (sum > max) {
                    max = sum;
                }
            } 
        }

        System.out.println(max);
    }
}