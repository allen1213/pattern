package com.example.test;

import java.time.*;
import java.util.Optional;

public class Main04 {
    public static void main(String[] args) {

        // 获取当前的日期时间
        LocalDateTime currentTime = LocalDateTime.now();

        LocalDate localDate = currentTime.toLocalDate();

        Month month = currentTime.getMonth();
        int dayOfMonth = currentTime.getDayOfMonth();
        DayOfWeek dayOfWeek = currentTime.getDayOfWeek();

        // 22 小时 15 分钟
        LocalTime date4 = LocalTime.of(22, 15);
        LocalTime date5 = LocalTime.parse("20:15:30");

    }

    private static void test01() {
        Main04 main04 = new Main04();

        Integer value1 = null;
        Integer value2 = new Integer(10);


        /*Optional<Integer> a = Optional.of(value1);
        System.out.println(a);*/

        Optional<Integer> b = Optional.of(value2);
        System.out.println(b.isPresent());
    }
}
