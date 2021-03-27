package com.dupa;

public class FooBuilder {

    private Foo foo;

    public FooBuilder() {
        foo = new Foo();
    }

    public FooBuilder Zkolorem(String kolor) {
        foo.setKolor(kolor);
        return this;
    }

    public FooBuilder ZNumerem(int numer) {
        foo.setNumer(numer);
        return this;
    }

    public FooBuilder ZPapiezem(boolean value) {
        foo.setPapiez(value);
        return this;
    }

    /*
    private String kolor;
    private int numer;
    private Boolean papiez;
     */

    public Foo Build() {
        return foo;
        // alternatywnie, wszystkei parametry zapisywane sa na poziomie tej klasy i potem w build ustawianie
        /*
        Foo foo = new Foo();
        foo.setKolor(kolor);
        foo.setNumer(numer);
        foo.setPapiez(papiez);
        return foo;
         */
    }
}
