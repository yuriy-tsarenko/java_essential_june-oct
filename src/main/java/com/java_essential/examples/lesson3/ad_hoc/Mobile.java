package com.java_essential.examples.lesson3.ad_hoc;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

public class Mobile {

    public String getTime() {
        return LocalTime.now().toString();
    }

    public String getTime(String pattern) {
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        return dateFormat.format(now);
    }

    public String getTime(long hours) {
        LocalTime now = LocalTime.now();
        return now.plusHours(hours).toString();
    }
}
