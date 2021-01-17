package day11.task2;

public class Warrior extends Hero implements PhysAttack {

    public Warrior() {
        health = 100;
        physAttack = 30;
        physDef = 0.8;
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


