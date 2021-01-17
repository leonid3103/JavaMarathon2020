package day11.task2;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer {
    public Shaman() {
        health = 100;
        physDef = 0.2;
        physAttack = 10;
        magicAttack = 15;
    }

    @Override
    public void magicalAttack(Hero hero) {
        if (hero.health - (magicAttack - (magicAttack * hero.magicDef)) > 0) {
            hero.health = hero.health - (magicAttack - (magicAttack * hero.magicDef));
        } else {
            hero.health = 0;
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

    @Override
    public void healHimself() {
        if ((health + 50) <= 100) {
            health = health + 50;
        } else {
            health = 100;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if ((hero.health + 30) <= 100) {
            hero.health = hero.health + 30;
        } else {
            hero.health = 100;
        }

    }
}
