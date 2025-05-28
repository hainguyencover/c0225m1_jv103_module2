package b3;

public class NextDayCalculator {
    private final int day;
    private final int month;
    private final int year;

    public NextDayCalculator(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int[] calculateNextDay() {
        int[] nextDay = new int[3];
        if (day < 1 || month < 1 || year < 1) {
            throw new IllegalArgumentException("Invalid date");
        }

        int daysInMonth = getDaysInMonth(month, year);

        if (day < daysInMonth) {
            nextDay[0] = day + 1; // Next day in the same month
            nextDay[1] = month;
            nextDay[2] = year;
        } else if (day == daysInMonth) {
            if (month == 12) {
                nextDay[0] = 1; // First day of the next year
                nextDay[1] = 1;
                nextDay[2] = year + 1;
            } else {
                nextDay[0] = 1; // First day of the next month
                nextDay[1] = month + 1;
                nextDay[2] = year;
            }
        }

        return nextDay;
    }
    private int getDaysInMonth(int month, int year) {
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> (isLeapYear(year)) ? 29 : 28;
            default -> throw new IllegalArgumentException("Invalid month");
        };
    }
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
