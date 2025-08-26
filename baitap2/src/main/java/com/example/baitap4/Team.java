package com.example.baitap4;

import java.util.List;

public class Team {
    private String teamName;
    private List<Player> players;
    public Team(String teamName, List<Player> players) {
        this.teamName = teamName;
        this.players = players;
    }
    public String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    public List<Player> getPlayers() {
        return players;
    }
    public void setPlayers(List<Player> players) {
        this.players = players;
    }
  public double getTotalScore() {
      double totalScore = 0;
      for (Player player : players) {
          totalScore += player.getScore();
      }
      return totalScore;
  }

}
