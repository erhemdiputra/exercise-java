import java.util.Scanner;

public class Solution {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        int len = s.length();

        for (int i = 0; i <= (len - k); i++) {
            String substr = s.substring(i, k + i);

            int resSmallest = substr.compareTo(smallest);
            if (resSmallest < 0) smallest = substr;

            int resLargest = substr.compareTo(largest);
            if (resLargest > 0) largest = substr;
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}



// Alternative
// import java.util.Scanner;
// import java.util.*;

// public class Solution {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         String str = sc.next();
//         int N = sc.nextInt();
//         int len = str.length();

//         SortedSet<String> set = new TreeSet<String>();

//         for (int i = 0; i <= (len - N); i++) {
//             String substr = str.substring(i, N+ i);
//             set.add(substr);
//         }

//         System.out.println(set.first());
//         System.out.println(set.last());
//     }
// }