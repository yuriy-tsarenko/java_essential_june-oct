package com.java_essential.safonov.homework.lesson7.Worker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateValid {
    public static boolean dateVolidate(String dateVolid, String formatDate) {
        if (dateVolid == null) {
            return false;
        }

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formatDate);
        simpleDateFormat.setLenient(false);
        try {
            Date date = simpleDateFormat.parse(dateVolid);
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
