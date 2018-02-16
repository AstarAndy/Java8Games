package com.astar.andy;

import java.util.concurrent.TimeUnit;

public class DurationGames {

    public static void main(String ... args) {
        System.out.println("Started.  Gonna wait 2 seconds and then stop.");
        DurationGames dg = new DurationGames();
        dg.forceDelayOf(TimeUnit.SECONDS, 2);
        System.out.println("That's a wrap.");
    }

    public void forceDelayOf(TimeUnit unitOfTime, int howLong) {
        try {
            unitOfTime.sleep(howLong);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
