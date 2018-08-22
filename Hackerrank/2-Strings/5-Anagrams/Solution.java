import java.util.Scanner;

public class Solution {
    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;

        a = a.toLowerCase();
        b = b.toLowerCase();

        char[] aArr = a.toCharArray();
        StringBuilder bSb = new StringBuilder(b);

        for (char val: aArr) {
            int idx = bSb.indexOf(Character.toString(val));
            if (idx != -1) {
                bSb.deleteCharAt(idx);
            }
        }

        boolean isAnagram = bSb.toString().isEmpty();
        return isAnagram;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams");
    }
}

// Alternative 1
// import java.util.HashMap;
// import java.util.Map;
// import java.util.Scanner;

// public class Solution {
//     static boolean isAnagram(String a, String b) {
//         if (a.length() != b.length()) return false;

//         char[] aArray = a.toLowerCase().toCharArray();
//         char[] bArray = b.toLowerCase().toCharArray();

//         Map<String, Integer> mapsA = new HashMap<String, Integer>();
//         Map<String, Integer> mapsB = new HashMap<String, Integer>();

//         for (char c : aArray) {
//             String str = Character.toString(c);
//             int val = 1;
//             if (mapsA.get(str) != null) {
//                 val = mapsA.get(str) + 1;
//             }
//             mapsA.put(str, val);
//         }

//         for (char c : bArray) {
//             String str = Character.toString(c);
//             int val = 1;
//             if (mapsB.get(str) != null) {
//                 val = mapsB.get(str) + 1;
//             }
//             mapsB.put(str, val);
//         }

//         return mapsA.equals(mapsB);
//     }

//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         String a = scan.next();
//         String b = scan.next();
//         scan.close();
//         boolean ret = isAnagram(a, b);
//         System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
//     }
// }

// Alternative 2
// import java.util.Scanner;
// import java.util.Arrays;

// public class Solution {

//     static boolean isAnagram(String a, String b) {
//         char[] aArr = a.toLowerCase().toCharArray();
//         char[] bArr = b.toLowerCase().toCharArray();

//         Arrays.sort(aArr);
//         Arrays.sort(bArr);

//         return Arrays.equals(aArr, bArr);
//     }

//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         String a = scan.next();
//         String b = scan.next();
//         scan.close();
//         boolean ret = isAnagram(a, b);
//         System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
//     }
// }