package day11.task2;

public class Task2 {
    public static void main(String[] args) {
        Warrior war = new Warrior();
        Palladin pal = new Palladin();
        Magician mag = new Magician();
        Shaman sham = new Shaman();
        war.physicalAttack(pal);
        System.out.println(pal.health);
        pal.physicalAttack(mag);
        System.out.println(mag.health);
        sham.healTeammate(mag);
        System.out.println(mag.health);
        mag.magicalAttack(pal);
        System.out.println(pal.health);
        sham.physicalAttack(war);
        System.out.println(war.health);
        pal.healHimself();
        System.out.println(pal.health);
        war.physicalAttack(mag);
        System.out.println(mag.health);
        war.physicalAttack(mag);
        System.out.println(mag.health);
        war.physicalAttack(mag);
        System.out.println(mag.health);
        war.physicalAttack(mag);
        System.out.println(mag.health);
        war.physicalAttack(mag);
        System.out.println(mag.health);
    }
}
