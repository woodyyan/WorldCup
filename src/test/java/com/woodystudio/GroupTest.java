package com.woodystudio;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GroupTest {
    @Test
    public void shouldGet6CompetionsWhenRunGameGiven4Teams() {
        Group group = new Group();
        Team aTeam = new Team();
        Team bTeam = new Team();
        Team cTeam = new Team();
        Team dTeam = new Team();
        group.setaTeam(aTeam);
        group.setbTeam(bTeam);
        group.setcTeam(cTeam);
        group.setdTeam(dTeam);

        List<Competition> competitions = group.run();

        Assert.assertEquals(6, competitions.size());
    }
}