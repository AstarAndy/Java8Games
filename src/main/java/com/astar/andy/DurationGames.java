package com.astar.andy;

import java.util.concurrent.TimeUnit;

public class DurationGames {

    public void forceDelayOf(TimeUnit unitOfTime, int howLong) {
        try {
            unitOfTime.sleep(howLong);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
