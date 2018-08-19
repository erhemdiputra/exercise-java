import java.util.Scanner;
import java.time.LocalDate;

public class Solution {
    public static String getDay(String dayStr, String monthStr, String yearStr) {
        int day = Integer.parseInt(dayStr);
        int month = Integer.parseInt(monthStr);
        int year = Integer.parseInt(yearStr);

        LocalDate ld = LocalDate.of(year, month, day);
        return ld.getDayOfWeek().toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        in.close();

        System.out.println(getDay(day, month, year));
    }
}