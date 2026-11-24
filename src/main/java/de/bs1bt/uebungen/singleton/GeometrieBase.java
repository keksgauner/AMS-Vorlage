package de.bs1bt.uebungen.singleton;

// Stub für eine Geometrie in der 3D-Welt (z.B. Würfel oder Kugel)
public class GeometrieBase {
    private String name;

    public GeometrieBase(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void render() {
        // Stub, hier würde die Geometrie gezeichnet werden
        System.out.println("Rendere " + name);
    }
}
