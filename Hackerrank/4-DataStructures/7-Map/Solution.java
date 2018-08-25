import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> maps = new HashMap<String, String>();

        long n = scanner.nextLong();
        scanner.nextLine();
        for (long i = 1; i <= n; i++) {
            String key = scanner.nextLine();
            String value = scanner.nextLine();
            maps.put(key, value);
        }

        while(scanner.hasNextLine()) {
            String key = scanner.nextLine();
            String value = maps.get(key);

            if (value == null) {
                System.out.println("Not found");
            } else {
                System.out.printf("%s=%s\n", key, value);
            }
        }
    }
}