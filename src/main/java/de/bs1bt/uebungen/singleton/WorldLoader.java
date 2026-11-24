package de.bs1bt.uebungen.singleton;

// Arbeitsauftrag 3: das ist der verbesserte WorldLoader
// Fehler die ich verbessert habe:
// - "public strategic WorldLoader loader" -> "private static WorldLoader instance"
// - Konstruktor war public void, jetzt private und ohne void
// - getWorldLoaderInstance() war nicht static und hat nie ein Objekt gemacht
// - loadWorld(pfad : String) ist UML, in Java heißt es loadWorld(String pfad)
// - nach dem Klassennamen hat die { gefehlt und nach loader das ;
public class WorldLoader {

    private static WorldLoader instance;

    private String geladenerPfad;

    private WorldLoader() {
    }

    public static WorldLoader getWorldLoaderInstance() {
        if (instance == null) {
            instance = new WorldLoader();
        }
        return instance;
    }

    public void loadWorld(String pfad) {
        // stub
        geladenerPfad = pfad;
        System.out.println("Lade Welt aus " + pfad);
    }

    public String getGeladenerPfad() {
        return geladenerPfad;
    }
}
