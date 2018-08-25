import java.util.Scanner;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int val = scanner.nextInt();
            arrList.add(val);
        }

        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            String act = scanner.next();

            if (act.equals("Insert"))    {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                arrList.add(x, y);

            } else if (act.equals("Delete")) {
                int x = scanner.nextInt();
                arrList.remove(x);
            }
        }

        int length = arrList.size();
        for(int i = 0; i < length; i++) {
            System.out.print(arrList.get(i));

            if (i == length - 1) {
                System.out.println("");
            } else {
                System.out.print(" ");
            }
        }
    }
}