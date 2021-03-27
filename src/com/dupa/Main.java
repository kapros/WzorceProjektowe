package com.dupa;

import com.dupa.Adapter.Adapter;
import com.dupa.Adapter.KlientA;
import com.dupa.Decorator.*;

public class Main {

    public static void main(String[] args) {
        Foo papiezZFabryki = FooFactory.getNewPapiez();
        System.out.println(papiezZFabryki.toString());

        Foo customowyPapiez =
                new FooBuilder()
                .Zkolorem("niebieski jak smerf")
                .ZNumerem(1488)
                .ZPapiezem(false)
                .Build();
        System.out.println(customowyPapiez.toString());

        Komponent komponent = new KonkretnyKomponent();
        AbstrakcyjnyDekorator dekoratorA = new KonkretnyDekoratorA();
        dekoratorA.setKomponent(komponent);
        AbstrakcyjnyDekorator dekoratorB = new KonkretnyDekoratorB();
        dekoratorB.setKomponent(dekoratorA);
        System.out.println("komponent zwraca " + komponent.tekst());
        System.out.println("dekoratorA zwraca" + dekoratorA.tekst());
        System.out.println("dekoratorB zwraca" + dekoratorB.tekst());
        dekoratorB.setKomponent(komponent);
        System.out.println("po podmianie komponentu, dekoratorB zwraca" + dekoratorB.tekst());

        KlientA klient = new KlientA();
        Adapter adapter = new Adapter(klient);
        System.out.println("oryginalnie klient zwraca stringa: " + klient.getBar().getNazwaBaru());
        System.out.println("a adapter tłumaczy go na informacje, które są nam potrzebne" + adapter.czyBrudny());
    }
}
