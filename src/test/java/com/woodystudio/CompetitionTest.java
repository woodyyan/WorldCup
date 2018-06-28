package com.woodystudio;

import org.junit.Assert;
import org.junit.Test;

public class CompetitionTest {
    @Test
    public void shouldGetRandomScoreWhenCompeteGivenHomeTeamAndVisitingTeam() {
        Team homeTeam = new Team();
        homeTeam.setName("China");
        Team visitingTeam = new Team();
        visitingTeam.setName("Japan");

        Competition competition = new Competition(homeTeam, visitingTeam);
        GameResult gameResult = competition.play();

        Assert.assertEquals("China", gameResult.getHomeTeam());
        Assert.assertEquals("Japan", gameResult.getVisitingTeam());
        Assert.assertEquals(ResultType.DRAW, gameResult.getResult());
    }
}