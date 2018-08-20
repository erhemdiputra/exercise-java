// import java.util.Scanner;

// public class Solution {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         String str = sc.next();
//         int len = str.length();

//         StringBuilder builder = new StringBuilder();
//         for (int i = len-1; i >= 0; i--) {
//             builder.append(str.charAt(i));
//         }

//         String reverse = builder.toString();
        
//         String res = "";
//         if (str.equals(reverse)) {
//             res = "Yes";
//         } else {
//             res = "No";
//         }

//         System.out.println(res);
//     }
// }

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String reverse = sb.toString();

        String res = "";
        if (str.equals(reverse)) {
            res = "Yes";
        } else {
            res = "No";
        }

        System.out.println(res);
    }
}