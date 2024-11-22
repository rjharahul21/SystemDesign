package main;

import main.AtmStatus.AtmState;

public class Atm {
    
    AtmState state;
    int twoknotes;
    public int getTwoknotes() {
        return twoknotes;
    }

    public void setTwoknotes(int twoknotes) {
        this.twoknotes = twoknotes;
    }

    int fivenotes;
    public int getFivenotes() {
        return fivenotes;
    }

    public void setFivenotes(int fivenotes) {
        this.fivenotes = fivenotes;
    }

    int hunnotes;

    public int getHunnotes() {
        return hunnotes;
    }

    public void setHunnotes(int hunnotes) {
        this.hunnotes = hunnotes;
    }

    public Atm(int twoknote, int fivenote, int hunnote) {
        this.twoknotes = twoknote;
        this.fivenotes = fivenote;
        this.hunnotes = hunnote;
    }

    public int getAtmBalance() {
        return twoknotes*2000 + fivenotes*500 + hunnotes*100;
    }

    public AtmState getState() {
        return state;
    }

    public void setState(AtmState state) {
        this.state = state;
    }
}
