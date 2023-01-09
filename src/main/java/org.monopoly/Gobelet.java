package org.monopoly;

public class Gobelet {
    private De de1;
    private De de2;

    public Gobelet() {
        de1 = new De();
        de2 = new De();
    }

    public int lancer() {
        de1.lancer();
        de2.lancer();
        return de1.getValeur() + de2.getValeur();
    }

    public boolean estUnDouble() {
        return de1.getValeur() == de2.getValeur();
    }
}