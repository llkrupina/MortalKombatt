package com.mycompany.mortalkombatt;

public class Heal extends FightAction {

    @Override
    public String getType() {
        return "Heal";
    }

    @Override
    public void realisation(Fighter fighter1, Fighter fighter2, String fighter2ActionType) {
        switch (fighter2ActionType) {
            case "Hit" -> {
            }
            case "Block" -> {
                fighter1.setHealth((fighter1.getMaxHealth() - fighter1.getHealth()) / 2 + fighter1.getHealth());
            }
            case "Debuff" -> {
            }
            case "Heal" -> {
            }
        }
    }
}
