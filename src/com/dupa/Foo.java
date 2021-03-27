package com.dupa;

public class Foo {
    private String kolor;
    private int numer;
    public boolean czyPapiez;

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public int getNumer() {
        return numer;
    }

    public void setNumer(int numer) {
        this.numer = numer;
    }

    public boolean getPapiez() {
        return czyPapiez;
    }

    public void setPapiez(boolean value) {
        czyPapiez = value;
    }

    @Override
    public String toString() {
        return "Te foo ma kolor: " + kolor + ", liczbe: " + numer + " oraz " + (czyPapiez ? "" : "nie") + "jest papieżem";
    }
}
