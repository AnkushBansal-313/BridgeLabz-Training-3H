import java.util.Scanner;

public class CalendarDisplay {
    static String[] months = {"January", "February", "March", "April", "May", "June", "July",
                              "August", "September", "October", "November", "December"};
    static int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    static int getDaysInMonth(int month, int year) {
        if (month == 1 && isLeapYear(year)) return 29;
        return days[month];
    }

    static int getFirstDayOfMonth(int year, int month) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + (31 * m0) / 12) % 7;
        return d0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt() - 1;
        int year = sc.nextInt();
        System.out.println("\n  " + months[month] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int firstDay = getFirstDayOfMonth(year, month + 1);
        int numDays = getDaysInMonth(month, year);
        for (int i = 0; i < firstDay; i++) System.out.print("    ");
        for (int day = 1; day <= numDays; day++) {
            System.out.printf("%3d ", day);
            if (((day + firstDay) % 7 == 0) || (day == numDays)) System.out.println();
        }
    }
}
