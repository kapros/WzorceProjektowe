package com.dupa.Adapter;

public class Adapter {

    private final KlientA klient;

    public Adapter(KlientA klient) {
        this.klient = klient;
    }

    public Boolean czyBrudny() {
        // z racji, że interfejs KlientA jest niekompatybilny z naszymi potrzebami, mamy klasą dostosowującą (adaptującą)
        // tego klienta do naszych potrzeb
        return this.klient.getBar().getNazwaBaru().contains("udny") ? true : false;
    }
}
