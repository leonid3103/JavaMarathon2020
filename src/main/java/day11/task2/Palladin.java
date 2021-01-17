package day11.task2;

public class Palladin extends Hero implements Healer, PhysAttack {

    public Palladin() {
        health = 100;
        physDef = 0.5;
        magicDef = 0.2;
        physAttack = 15;
    }

    @Override
    public void healHimself() {
        if ((health + 25) <= 100) {
            health = health + 25;
        } else {
            health = 100;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if ((hero.health + 10) <= 100) {
            hero.health = hero.health + 10;
        } else {
            hero.health = 100;
        }

    }

    @Override
    public void physicalAttack(Hero hero) {
        if (hero.health - (physAttack - (physAttack * hero.physDef)) > 0) {
            hero.health = hero.health - (physAttack - (physAttack * hero.physDef));
        } else {
            hero.health = 0;

        }
    }
}
