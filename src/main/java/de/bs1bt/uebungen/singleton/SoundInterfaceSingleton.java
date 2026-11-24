package de.bs1bt.uebungen.singleton;

// Arbeitsauftrag 1: es gibt nur ein Sound-Interface für das ganze Spiel
public class SoundInterfaceSingleton {

    private static SoundInterfaceSingleton interfaceInstanz;

    private SoundInterfaceSingleton() {
    }

    public static SoundInterfaceSingleton getInterface() {
        if (interfaceInstanz == null) {
            interfaceInstanz = new SoundInterfaceSingleton();
        }
        return interfaceInstanz;
    }

    public void play(WaveDatei sound) {
        // Stub, hier würde eigentlich der Sound abgespielt werden
        System.out.println("Spiele " + sound.getPfad() + " ab");
    }
}
