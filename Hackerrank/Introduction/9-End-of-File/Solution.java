import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int idx = 0;
        while(scanner.hasNext()) {
            idx++;
            String s = scanner.nextLine();
            System.out.printf("%d %s%n", idx, s);
        }
    }
}