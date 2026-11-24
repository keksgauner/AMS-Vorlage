package de.bs1bt.uebungen.singleton;

import java.util.ArrayList;

// Arbeitsauftrag 2: es gibt nur einen Renderer für die 3D-Welt
public class WeltSingleton {

    private static WeltSingleton welt;

    // hier werden die Geometrien gespeichert
    private ArrayList<GeometrieBase> geometrien = new ArrayList<>();

    private WeltSingleton() {
    }

    public static WeltSingleton getWelt() {
        if (welt == null) {
            welt = new WeltSingleton();
        }
        return welt;
    }

    // speichert die Liste mit den Geometrien
    public void set(ArrayList<GeometrieBase> liste) {
        geometrien = liste;
    }

    // rendert alle Geometrien aus der Liste
    public void render() {
        for (GeometrieBase geometrie : geometrien) {
            geometrie.render();
        }
    }

    public ArrayList<GeometrieBase> getGeometrien() {
        return geometrien;
    }
}
