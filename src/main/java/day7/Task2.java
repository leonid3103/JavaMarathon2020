package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        final int min = 90;
        final int max = 100;
        Random rand = new Random();
        int stamina = min + rand.nextInt(max - min + 1);
        Player player = new Player(stamina);
        player.run();
        Player player1 = new Player(stamina);
        Player player2= new Player(stamina);
        Player player3 = new Player(stamina);
        Player player4 = new Player(stamina);
        Player player5 = new Player(stamina);
        Player player6 = new Player(stamina);
        Player player7 = new Player(stamina);
        System.out.println(player.getStamina());
        System.out.println(player2.getStamina());
        System.out.println(Player.getCountPlayers());
        Player.info();
    }
}
