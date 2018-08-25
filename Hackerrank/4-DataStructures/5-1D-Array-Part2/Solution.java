import java.util.Scanner;

public class Solution {
    private static boolean isSolveable(int[] arr, int leap, int i) {
        if (i < 0 || arr[i] == 1) {
            return false;
        } else if (i == arr.length-1 || i + leap >= arr.length) {
            return true;
        }

        arr[i] = 1;
        return isSolveable(arr, leap, i+1) || isSolveable(arr, leap, i-1) || 
        isSolveable(arr, leap, i+leap);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();

        for (int i = 0; i < q; i++) {
            int n = scanner.nextInt();
            int leap = scanner.nextInt();
            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }

            System.out.println(isSolveable(arr, leap, 0) ? "YES" : "NO");
        }
    }
}