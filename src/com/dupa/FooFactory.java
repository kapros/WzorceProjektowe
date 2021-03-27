package com.dupa;

public class FooFactory {

    public static Foo getNewPapiez() {
        Foo foo = new Foo();
        foo.setKolor("zolty");
        foo.setPapiez(true);
        foo.setNumer(2137);
        return foo;
    }

    // teoretycznie można dodać parametry, ale najlepiej ograniczyć to tylko do istotnych, powyżej 3 juz lepiej użyć buildera
    public static Foo getNewPapiez(String kolor) {
        Foo foo = new Foo();
        foo.setKolor(kolor);
        foo.setPapiez(true);
        foo.setNumer(2137);
        return foo;
    }
}
