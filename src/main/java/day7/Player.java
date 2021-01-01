package day7;

public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers >= 0 && countPlayers < 6)
            countPlayers++;
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        int count = 0;
        if (stamina <= 0) {
            stamina = count;
            countPlayers = count;
        } else {
            stamina = stamina-1;
            countPlayers = countPlayers-1;
        }
    }

    public static void info() {
        if (Player.countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть " +
                    (6 - Player.countPlayers) + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }


    }
}
