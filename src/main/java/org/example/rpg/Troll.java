package org.example.rpg;

import org.example.rpg.utils.PercentageConstant;

public class Troll extends Monster implements Bleedable, Poisonable{

    public Troll(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double bleed() {
        return getDamage() * PercentageConstant.BLEED_PERCENTAGE;
    }

    @Override
    public double bleed(int level) {
        return level * getDamage() * PercentageConstant.BLEED_PERCENTAGE;
    }

    @Override
    public double poison() {
        return getDamage() * PercentageConstant.POISON_PERCENTAGE;
    }

    @Override
    public double attack(){
        return getDamage() + bleed() + poison();
    }
}
