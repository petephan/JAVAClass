/*
 10.8: Date Class
 Peter Phan 11/8/14
 */

public class Date {

    private int month;
    private int day;
    private int year;

    public Date(int theMonth, int theDay, int theYear) {
        month = checkMonth(theMonth);
        year = theYear;
        day = checkDay(theDay);
    }

    private int checkMonth(int testMonth) {
        if (testMonth > 0 && testMonth <= 12) {
            return testMonth;
        } else {
            return 1;
        }
    }

    private int checkDay(int testDay) {
        int daysPerMonth[]
                = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (testDay > 0 && testDay <= daysPerMonth[ month]) {
            return testDay;
        }

        return testDay;
    }

    public int getMonth() {
        return month;
    }

    public String toDateString() {
        return month + "/" + day + "/" + year;
    }
}