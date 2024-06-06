package com.mycompany.mortalkombatt;



public abstract class FightAction {
    public abstract String getType();
    public abstract void realisation(Fighter fighter1, Fighter fighter2, String fighter2ActionType);
}
