package com.woodystudio;

public class GameResult {
    private String homeTeam;
    private String visitingTeam;
    private ResultType result;

    public GameResult(String homeTeam, String visitingTeam, ResultType result) {
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.result = result;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public String getVisitingTeam() {
        return visitingTeam;
    }

    public ResultType getResult() {
        return result;
    }
}
