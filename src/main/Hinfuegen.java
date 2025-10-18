package main;

import java.time.LocalDate;
import java.util.Scanner;

public class Hinfuegen {

	public void hinfuegenAufgabe() {
	    Scanner input = new Scanner(System.in);

	    System.out.print("Titel: ");
	    String titel = input.nextLine();

	    System.out.print("Beschreibung: ");
	    String beschreibung = input.nextLine();

	    LocalDate datum = LocalDate.now();
	    Aufgabe neueAufgabe = new Aufgabe(titel, beschreibung, false, datum);

	    // In ArrayList speichern
	    DataSpeicherung.aufgabeHinzufuegen(neueAufgabe);

	    // Nur neue Aufgabe anhängen
	    DataSpeicherung.aufgabeAnhängen("TodoList.txt", neueAufgabe);

	    System.out.println("✅ Aufgabe wurde hinzugefügt und gespeichert.");
	}

}
