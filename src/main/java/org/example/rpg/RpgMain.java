package org.example.rpg;

public class RpgMain {
    public static void main(String[] args) {
        Monster shrek = new Troll("Shrek", 1000, 25);
        Monster hyena = new Werewolf("Hyena", 600, 35);

        printResult(shrek);
        printResult(hyena);
    }

    private static void printResult(Monster monster){
        System.out.println("Attack result of: " + monster.getName() + ": " + monster.attack());
    }
}
