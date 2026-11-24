package de.bs1bt.uebungen.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertSame;

class SoundInterfaceSingletonTest {

    @Test
    void testImmerDasGleicheObjekt() {
        assertSame(SoundInterfaceSingleton.getInterface(), SoundInterfaceSingleton.getInterface());
    }

    @Test
    void testPlay() {
        WaveDatei wd = new WaveDatei("sounds/crashboombang.wav");
        assertDoesNotThrow(() -> SoundInterfaceSingleton.getInterface().play(wd));
    }
}
