import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        Deque deque = new ArrayDeque();
        HashSet<Integer> hashSet = new HashSet<>();
        int max = Integer.MIN_VALUE;

        for(int i = 1; i <= n; i++) {
            int val = scanner.nextInt();
            deque.add(val);
            hashSet.add(val);

            if (deque.size() == m) {
                if (hashSet.size() > max) {
                    max = hashSet.size();
                }

                int first = (int) deque.remove();
                if (!deque.contains(first)) {
                    hashSet.remove(first);
                }
            }
        }

        System.out.println(max);
    }
}