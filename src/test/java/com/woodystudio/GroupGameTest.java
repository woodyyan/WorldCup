package com.woodystudio;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GroupGameTest {
    @Test
    public void shouldGet6GameResultsWhenRunGameGiven4Teams() {
        GroupGame groupGame = new GroupGame();
        Team aTeam = new Team();
        Team bTeam = new Team();
        Team cTeam = new Team();
        Team dTeam = new Team();
        groupGame.setaTeam(aTeam);
        groupGame.setbTeam(bTeam);
        groupGame.setcTeam(cTeam);
        groupGame.setdTeam(dTeam);

        List<GameResult> gameResults = groupGame.run();

        Assert.assertEquals(6, gameResults.size());
        Assert.assertEquals(6, gameResults.get(0).getHomeTeam());
    }
}