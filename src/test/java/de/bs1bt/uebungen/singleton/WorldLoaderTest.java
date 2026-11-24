package de.bs1bt.uebungen.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class WorldLoaderTest {

    @Test
    void testImmerDasGleicheObjekt() {
        assertSame(WorldLoader.getWorldLoaderInstance(), WorldLoader.getWorldLoaderInstance());
    }

    @Test
    void testLoadWorld() {
        WorldLoader w = WorldLoader.getWorldLoaderInstance();
        w.loadWorld("maps/intro.xml");
        assertEquals("maps/intro.xml", w.getGeladenerPfad());
    }
}
