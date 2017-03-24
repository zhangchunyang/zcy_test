package org.zcy.tester.base;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestCalendar {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Calendar calendar = Calendar.getInstance();
        if (calendar instanceof GregorianCalendar) {
            System.out.println("It is an instance of GregorianCalendar");
        }
    }
}
