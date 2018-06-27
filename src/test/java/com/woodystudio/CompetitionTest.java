package com.woodystudio;

import org.junit.Assert;
import org.junit.Test;

public class CompetitionTest {
    @Test
    public void shouldGetRandomScoreWhenCompeteGivenHomeTeamAndVisitingTeam() {
        Team homeTeam = new Team();
        Team visitingTeam = new Team();

        Competition competition = new Competition(homeTeam, visitingTeam);
        Score score = competition.play();

        Assert.assertEquals(score.getFirstPoint(), 2);
        Assert.assertEquals(score.getSecondPoint(), 1);
    }
}