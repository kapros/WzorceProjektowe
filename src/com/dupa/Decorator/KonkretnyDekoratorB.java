package com.dupa.Decorator;

public class KonkretnyDekoratorB extends AbstrakcyjnyDekorator {

    @Override
    public String tekst() {
        String t = this.komponent.tekst();
        return "tekst dodany przez dekorator B " + t;
    }
}