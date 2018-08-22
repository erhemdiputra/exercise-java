import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.trim();

        if (s.equals("")) {
            System.out.println("0");
        } else {
            String delimiter = "[ !,?._'@]+";
            String[] tokens = s.split(delimiter);

            System.out.println(tokens.length);
            for (String token : tokens) {
                System.out.println(token);
            }
        }
        sc.close();
    }
}