package com.woodystudio;

import java.util.ArrayList;
import java.util.List;

public class WorldCup {

    public void equals(List<GameResult> results, List<Team> teams) {
        List<String> ss = new ArrayList<>();
        ss.add("");
        ss.add("");
        ss.add("");
        ss.add("");
        ss.add("");
        ss.add("");
        ss.add("");
        ss.add("");
        ss.add("");
        ss.add("");
        ss.add("");
        ss.add("");
        ss.add("");
        ss.add("");
        ss.add("");
        ss.add("");
        ss.add("");
        ss.add("");

        for (String s : ss) {

        }

        for (int j = 0; j < 6; j++) {
            for (int i = 0; i < 3; i++) {

            }
        }
    }
}

// as a team, i have my name, my accumulate points（积分）. 10
// as a game result, i have home team and visiting team and result. 10
// as a competition, i have home team and visiting team, and i can compete then get the game result. 10
// as a group game, i have 4 teams, i can run group game and return 6 game results. 10
// as a point system, i have team:points. i can add points for team. i can get points for team. 10
// as a forecast system, input is some game results and four teams, and a team who will win, output is all game results. 30

// A0:B0 A1:B0 A0:B1
// A0:C0 A1:C0 A0:C1
// A0:D0 A1:D0 A0:D1
// B0:C0 B1:C0 B0:C1
// B0:D0 B1:D0 B0:D1
// C0:D0 C1:D0 C0:D1
