package com.astar.andy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class DurationGamesTest {

    @Test
    public void Duration_Test_For_3_second_Delay() {
        Instant startedAt = Instant.now();
        DurationGames dg = new DurationGames();
        dg.forceDelayOf(TimeUnit.SECONDS, 3);
        Duration elpTime = Duration.between(startedAt, Instant.now());
        assertEquals(elpTime.getSeconds(), 3);

    }

}