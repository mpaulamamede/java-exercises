package src.leap_year_calculator;

public class LeapYear {

    public static boolean isLeapYear (int year) {
        boolean isLeapYear = false;

        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        isLeapYear = true;
                    }
                } else {
                    isLeapYear = true;
                }
            }
        }

        return isLeapYear;
    }
}
