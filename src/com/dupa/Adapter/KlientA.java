package com.dupa.Adapter;

public class KlientA {

    // to jest jakiś interfejs, którego nie możemy użyć, na przykład nie potrzebujemy całego, albo jest on wykorzystywany w wielu miejscach
    // i unikamy obsługiwania go za każdym razem, tylko tutaj mamy uniwersalny tłumaczenie
    public Bar getBar() {
        Bar b = new Bar();
        b.setNazwaBaru("brudny");
        return b;
    }
}
