package de.bs1bt.ams.repository;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.*;

class DBConfigSingletonTest {

    @Test
    void testImmerDasGleicheObjekt() {
        DBConfigSingleton a = DBConfigSingleton.getInstance();
        DBConfigSingleton b = DBConfigSingleton.getInstance();
        assertSame(a, b);
    }

    @Test
    void testGetter() {
        assertEquals("jdbc:mysql://localhost:3306/ams_fx_test", DBConfigSingleton.getInstance().getUrl());
        assertEquals("schueler", DBConfigSingleton.getInstance().getUser());
        assertEquals("Geheim01", DBConfigSingleton.getInstance().getPassword());
    }

    @Test
    void testKeineSetter() {
        // man soll die Zugangsdaten von außen nicht ändern können
        for (Method methode : DBConfigSingleton.class.getDeclaredMethods()) {
            assertFalse(methode.getName().startsWith("set"), "Setter gefunden: " + methode.getName());
        }
    }

    @Test
    void testKonstruktorIstPrivat() {
        for (Constructor<?> konstruktor : DBConfigSingleton.class.getDeclaredConstructors()) {
            assertTrue(Modifier.isPrivate(konstruktor.getModifiers()));
        }
    }
}
