package main;

import java.time.LocalDate;

public class Aufgabe {
	private String titel;
	private String beschreibung;
	private boolean status;
	private LocalDate date;
	
	public Aufgabe(String titel, String beschreibung, boolean status, LocalDate date) {
		this.titel=titel;
		this.beschreibung=beschreibung;
		this.status=status;
		this.date=date;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public String getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	

}
