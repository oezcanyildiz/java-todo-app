package main;
import java.util.Scanner;

public class EingabeUsers {
	Scanner input = new Scanner(System.in);
	
	
	public void ersteEingabe() {
		Hinfuegen hinzufuegen = new Hinfuegen();
		Loeschen loeschen =new Loeschen();
		ListenAufgabe listen = new ListenAufgabe();
		
		

		  boolean running = true;
		while(running) {
			System.out.print("Bitte ihre Eingabe : ");
			int zahl=input.nextInt();
			input.nextLine();
			
			switch(zahl) {
			case 1:
				listen.dateiAnzeigen("TodoList.txt");
				break;
			case 2:
				hinzufuegen.hinfuegenAufgabe();
				break;
			case 3:
				loeschen.loeschenAufgabe();
				break;
            case 4:
                running = false;
                System.out.println("Programm beendet 👋");
                break;
            default:
                System.out.println("Ungültige Eingabe!");
			}
		}

	}
}
