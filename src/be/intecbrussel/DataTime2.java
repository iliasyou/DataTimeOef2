package be.intecbrussel;

import java.time.LocalDate;

public class DataTime2 {
    public static void main(String[] args) {


        LocalDate MyB = LocalDate.of(1995, 04, 03);
        System.out.println(MyB.getDayOfYear());
        System.out.println(MyB.getDayOfMonth());
        System.out.println(MyB.getDayOfWeek());
//
        int year = 1995;
        if ((year % 4 == 0) && year % 100 != 0) {
            System.out.println(year + "een schrikkeljaar");
        } else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
            System.out.println(year + "een schrikkeljaar");
        } else {
            System.out.println(year + " geen schrikkeljaar");
        }


    }
}
