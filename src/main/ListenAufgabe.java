package main;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class ListenAufgabe {
	 public void dateiAnzeigen(String TodoList) {
	        try (BufferedReader reader = new BufferedReader(new FileReader(TodoList))) {
	            String line;
	            System.out.println("----- Aufgaben in Datei -----");
	            while ((line = reader.readLine()) != null) {
	                System.out.println(line);
	            }
	            System.out.println("-----------------------------");
	        } catch (IOException e) {
	            System.out.println("Fehler beim Lesen der Datei oder Datei existiert nicht.");
	        }
	    }
}
