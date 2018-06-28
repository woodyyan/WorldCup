package com.woodystudio;

import java.util.ArrayList;
import java.util.List;

public class GroupGame {
    private Team aTeam;
    private Team bTeam;
    private Team cTeam;
    private Team dTeam;

    public Team getaTeam() {
        return aTeam;
    }

    public void setaTeam(Team aTeam) {
        this.aTeam = aTeam;
    }

    public Team getbTeam() {
        return bTeam;
    }

    public void setbTeam(Team bTeam) {
        this.bTeam = bTeam;
    }

    public Team getcTeam() {
        return cTeam;
    }

    public void setcTeam(Team cTeam) {
        this.cTeam = cTeam;
    }

    public Team getdTeam() {
        return dTeam;
    }

    public void setdTeam(Team dTeam) {
        this.dTeam = dTeam;
    }

    public List<GameResult> run() {
        List<GameResult> results = new ArrayList<>();

        return results;
    }
}
