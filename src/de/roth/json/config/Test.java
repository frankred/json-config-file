package de.roth.json.config;

public class Test {

	public static void main(String[] args) {
		// Konfigurationsdatei laden, falls vorhanden
		// ansonsten werden die Werte im Konstruktor verwendet
		Config.load("config.json");

		// Zugriff auf Attribut
		Config.getInstance().TITLE = "Neuer Titel";
		Config.getInstance().RATIO = 0.4;
		for (String s : Config.getInstance().NAMES) {
			System.out.println(s);
		}

		// Speichern der Konfigurationsdatei
		Config.getInstance().toFile("config.json");
	}
}
