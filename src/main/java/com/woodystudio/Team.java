package com.woodystudio;

public class Team {
    private String name;
    private Integer totalGoals;
    private Integer accumulatePoints;

    public Integer getAccumulatePoints() {
        return accumulatePoints;
    }

    public void setAccumulatePoints(Integer accumulatePoints) {
        this.accumulatePoints = accumulatePoints;
    }

    public Integer getTotalGoals() {
        return totalGoals;
    }

    public void setTotalGoals(Integer totalGoals) {
        this.totalGoals = totalGoals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
