package de.bs1bt.uebungen.singleton;

import java.util.ArrayList;

// zum Ausprobieren von allen Singletons aus dem Übungsblatt
public class Main {
    public static void main(String[] args) {
        // Arbeitsauftrag 1
        WaveDatei wd = new WaveDatei("sounds/crashboombang.wav");
        SoundInterfaceSingleton.getInterface().play(wd);

        // Arbeitsauftrag 2
        ArrayList<GeometrieBase> liste = new ArrayList<>();
        liste.add(new GeometrieBase("Würfel"));
        liste.add(new GeometrieBase("Kugel"));
        WeltSingleton.getWelt().set(liste);
        WeltSingleton.getWelt().render();

        // Arbeitsauftrag 3 (die verbesserte Main.java)
        String pfad = "maps/intro.xml";
        WorldLoader w = WorldLoader.getWorldLoaderInstance();
        w.loadWorld(pfad);
    }
}
