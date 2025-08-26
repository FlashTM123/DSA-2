package com.example.baitap4;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Tạo một số cầu thủ
        Player player1 = new Player("Lionel Messi", 30);
        Player player2 = new Player("Cristiano Ronaldo", 28);
        Player player3 = new Player("Neymar Jr", 25);

        // Tạo một số đội bóng
        Team team1 = new Team("Team A", List.of(player1, player2));
        Team team2 = new Team("Team B", List.of(player3));

        // Tạo một danh sách các đội bóng
        List<Team> teams = List.of(team1, team2);

        // Tạo một quản lý
        Manager manager = new Manager(teams);

        // Lấy cầu thủ xuất sắc nhất
        Player bestPlayer = manager.getBestPlayer();
        System.out.println("Cầu thủ xuất sắc nhất: " + bestPlayer.getName());

        // Lấy danh sách các đội bóng xếp hạng
        List<Team> rankedTeams = manager.getRankedTeams();
        System.out.println("Danh sách các đội bóng xếp hạng:");
        for (Team team : rankedTeams) {
            System.out.println(team.getTeamName() + " - Tổng điểm: " + team.getTotalScore());
        }
    }
}
