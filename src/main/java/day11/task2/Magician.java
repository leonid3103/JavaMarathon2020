package day11.task2;

public class Magician extends Hero implements MagicAttack, PhysAttack {

    public Magician() {
        health = 100;
        physDef = 0;
        physAttack = 5;
        magicAttack = 20;
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
}}
