package com.woodystudio;

public class Competition {
    private Team homeTeam;
    private Team visitingTeam;

    public Competition(Team homeTeam, Team visitingTeam) {
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public Team getVisitingTeam() {
        return visitingTeam;
    }

    public GameResult play() {
        GameResult gameResult = new GameResult(homeTeam.getName(), visitingTeam.getName(), ResultType.DRAW);
        return gameResult;
    }
}
