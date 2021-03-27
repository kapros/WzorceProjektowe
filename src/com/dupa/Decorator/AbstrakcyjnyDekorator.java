package com.dupa.Decorator;

public abstract class AbstrakcyjnyDekorator implements Komponent {

    protected Komponent komponent;

    public abstract String tekst();

    // można przez konstruktor:
    /*
    public AbstrakcyjnyDekorator(Komponent k) {
        komponent = k;
    }
     */
    public void setKomponent(Komponent k) {
        komponent = k;
    }
}
