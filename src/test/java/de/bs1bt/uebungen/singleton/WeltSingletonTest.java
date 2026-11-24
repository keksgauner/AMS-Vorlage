package de.bs1bt.uebungen.singleton;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class WeltSingletonTest {

    @Test
    void testImmerDasGleicheObjekt() {
        assertSame(WeltSingleton.getWelt(), WeltSingleton.getWelt());
    }

    @Test
    void testSetUndRender() {
        ArrayList<GeometrieBase> liste = new ArrayList<>();
        liste.add(new GeometrieBase("Würfel"));
        liste.add(new GeometrieBase("Kugel"));

        WeltSingleton.getWelt().set(liste);
        WeltSingleton.getWelt().render();

        assertEquals(2, WeltSingleton.getWelt().getGeometrien().size());
        assertEquals("Kugel", WeltSingleton.getWelt().getGeometrien().get(1).getName());
    }
}
