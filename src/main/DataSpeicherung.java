package main;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DataSpeicherung {
	private static List<Aufgabe> aufgabenListe = new ArrayList<>();
	
	
	  public static void dateiErstellen(String TodoList) {
	        try {
	            File file = new File("TodoList");
	            if (file.createNewFile()) {
	                System.out.println("Datei erstellt: " + file.getName());
	            } else {
	                System.out.println("Datei existiert bereits.");
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	  // Aufgabe zur Liste hinzufügen
	    public static void aufgabeHinzufuegen(Aufgabe aufgabe) {
	        aufgabenListe.add(aufgabe);
	    }

	    // Liste zurückgeben
	    public static List<Aufgabe> getAufgaben() {
	        return aufgabenListe;
	    }
	    
	    public static void aufgabenSpeichern(String TodoList) {
	        try (FileWriter writer = new FileWriter(TodoList)) {  // überschreibt Datei komplett
	            for (Aufgabe a : aufgabenListe) {
	                writer.write(a.getTitel() + ";" + a.getBeschreibung() + ";" + a.isStatus() + ";" + a.getDate() + "\n");
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    // 2. Nur EINE Aufgabe anhängen
	    public static void aufgabeAnhängen(String TodoList, Aufgabe a) {
	        try (FileWriter writer = new FileWriter(TodoList, true)) {  // append = true
	            writer.write(a.getTitel() + ";" + a.getBeschreibung() + ";" + a.isStatus() + ";" + a.getDate() + "\n");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}
