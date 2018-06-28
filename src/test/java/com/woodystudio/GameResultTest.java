package com.woodystudio;

import org.junit.Assert;
import org.junit.Test;

public class GameResultTest {
    @Test
    public void shouldGetCorrectInfoGivenHomeTeamAndVisitingTeamScore() {
        GameResult result = new GameResult("China", "Japan", ResultType.DRAW);

        Assert.assertEquals("China", result.getHomeTeam());
        Assert.assertEquals("Japan", result.getVisitingTeam());
        Assert.assertEquals(1, result.getResult());
    }
}