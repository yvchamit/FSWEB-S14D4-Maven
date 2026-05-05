package org.example.rpg;

import org.example.rpg.utils.PercentageConstant;

public interface Poisonable {

    default double poison(){
     return PercentageConstant.POISON_PERCENTAGE;
    }

}
