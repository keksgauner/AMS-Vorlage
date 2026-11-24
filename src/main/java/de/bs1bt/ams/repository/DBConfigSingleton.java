package de.bs1bt.ams.repository;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

// Hier sind die Zugangsdaten für die Datenbank gespeichert.
// Es gibt nur ein Objekt davon, das man mit getInstance() bekommt.
public class DBConfigSingleton {

    // hier wird das einzige Objekt gespeichert
    private static DBConfigSingleton instance;

    private String url;
    private String user;
    private String password;

    // private, damit keiner von außen new DBConfigSingleton() machen kann
    private DBConfigSingleton() {
        // die Daten werden aus der Datei db.properties gelesen,
        // damit sie nicht fest im Code stehen
        Properties properties = new Properties();
        try {
            InputStream datei = DBConfigSingleton.class.getResourceAsStream("db.properties");
            if (datei != null) {
                properties.load(datei);
                datei.close();
            }
        } catch (IOException e) {
            System.out.println("db.properties konnte nicht gelesen werden");
        }

        // wenn was in der Datei fehlt, werden die Daten aus der compose.yaml genommen
        url = properties.getProperty("db.url", "jdbc:mysql://localhost:3306/ams_fx_test");
        user = properties.getProperty("db.user", "schueler");
        password = properties.getProperty("db.password", "Geheim01");
    }

    public static DBConfigSingleton getInstance() {
        // nur beim ersten Mal wird ein neues Objekt gemacht
        if (instance == null) {
            instance = new DBConfigSingleton();
        }
        return instance;
    }

    // es gibt nur Getter und keine Setter, damit man die Daten nicht ändern kann

    public String getUrl() {
        return url;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
}
