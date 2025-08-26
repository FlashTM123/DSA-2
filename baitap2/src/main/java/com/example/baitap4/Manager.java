package com.example.baitap4;

import java.util.List;
import java.util.ArrayList; // Thêm dòng này

public class Manager {
   private List<Team> teams;

   public Manager(List<Team> teams) {
       this.teams = teams;
   }
   public void addTeam(Team team) {
       teams.add(team);
   }
   public Player getBestPlayer(){
       Player bestPlayer = null;
       double highestScore = 0;

       for (Team team : teams) {
           for (Player player : team.getPlayers()) {
               if (player.getScore() > highestScore) {
                   highestScore = player.getScore();
                   bestPlayer = player;
               }
           }
       }
       return bestPlayer;
   }
   public List<Team> getRankedTeams() {
       List<Team> rankedTeams = new ArrayList<>(teams);
       rankedTeams.sort((team1, team2) -> Double.compare(team2.getTotalScore(), team1.getTotalScore()));
       return rankedTeams;
   }
   public List<Team> getTeams() {
       return teams;
   }
}
