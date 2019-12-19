package com.company;

public class Warrior extends Player implements AttackCapable{
    private String physical;

    public String getPhysical() {
        return physical;
    }

    public void setPhysical(String physical) {
        this.physical = physical;
    }

    @Override
    public void AttackType() {

    }
}
