import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        Solve(a, b);
    }

    private static void Solve(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();

        String str1 = "No";
        if (a.compareTo(b) > 0) str1 = "Yes";

        String str2 = a.substring(0, 1).toUpperCase() + a.substring(1) + " " + 
            b.substring(0, 1).toUpperCase() + b.substring(1);

        System.out.println(lenA+lenB);
        System.out.println(str1);
        System.out.println(str2);
    }
}