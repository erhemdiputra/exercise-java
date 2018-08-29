import java.util.Scanner;
import java.util.*;

public class Solution {
    private static boolean isBalance(String str, Map<Character, Character> maps) {
        int len = str.length();
        if (len % 2 != 0)  {
            return false;
        }

        Stack  stack = new Stack();

        for (int i = 0; i < len; i++) {
            Character c = str.charAt(i);

            if (maps.containsKey(c)) {
                stack.push(c);
                continue;
            }

            if (stack.isEmpty()) {
                return false;
            }

            Character val = (Character) stack.pop();
            if (c != maps.get(val)) {
                return false;
            }
        }

        return stack.isEmpty();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character, Character> maps = new HashMap<>();
        maps.put('(', ')');
        maps.put('{', '}');
        maps.put('[', ']');

        while(scanner.hasNext()) {
            String str = scanner.next();
            System.out.println(isBalance(str, maps));
        }

        scanner.close();
    }
}