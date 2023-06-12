package com.openclassrooms.mareu.utils;

import java.text.DateFormat;
import java.util.Calendar;

public class Filter {
    String getStringCurrentDate() {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        String dateString = DateFormat.getDateInstance().format(cal.getTime());
        return dateString;
    }
}
