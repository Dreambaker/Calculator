package com.galaxy.calculator.beans;

public class goods {

    private String name;
    private int unitCredits;

    public goods() {
    }

    public goods(String name, int unitCredits) {
        this.name = name;
        this.unitCredits = unitCredits;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUnitCredits() {
        return unitCredits;
    }

    public void setUnitCredits(int unitCredits) {
        this.unitCredits = unitCredits;
    }
}
