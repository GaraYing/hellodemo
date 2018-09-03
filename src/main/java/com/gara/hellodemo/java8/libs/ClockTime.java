package com.gara.hellodemo.java8.libs;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @description: 时间
 * @author: GaraYing
 * @create: 2018-09-03 17:40
 **/

public class ClockTime {

    public static void main(String[] args) {
        // Get the system clock as UTC offset
        final Clock clock = Clock.systemUTC();
        System.out.println( clock.instant() );
        System.out.println( clock.millis() );
        System.out.println( System.currentTimeMillis() );

        // Get the local date and local time
        final LocalDate date = LocalDate.now();
        final LocalDate dateFromClock = LocalDate.now( clock );

        System.out.println( date );
        System.out.println( dateFromClock );

        // Get the local date and local time
        final LocalTime time = LocalTime.now();
        final LocalTime timeFromClock = LocalTime.now( clock );

        System.out.println( time );
        System.out.println( timeFromClock );
    }
}
