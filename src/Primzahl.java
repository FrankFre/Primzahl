import java.util.Arrays;
import java.util.Scanner;

public class Primzahl {

	public static void main(String[] args) {

		int xmax;
		int x = 2;

		Scanner eing = new Scanner(System.in);

		System.out.println("Ermittlung von Primzahlen nach dem Sieb des Eratosthenes ");
		System.out.print("Bitte geben sie den Zahlenbereich an: ");
		xmax = eing.nextInt();

		erzeugen(xmax);

	}

	private static int fakultaet(int fak) {

		int reihe = 1;

		if (fak > 0) {
			for (int i = 1; i <= fak; i++) {
				reihe = reihe * i;
			}

		}
		return reihe;
	}

	private static void erzeugen(int xmax) {

		int i, k;
		int[] feld = new int[xmax + 1];

		
		for (i = 1; i <= xmax; i++) {					// Füllen des Arrays mit einer Zahlenreihe
			feld[i] = i;
		}
		

		for(i = 2; i <= xmax; i++) {				 // Abfrage, ob das Feld gelöscht wurde, Iteration durch Array

			for (int j = 2; j <= i; j++) { 					// Prüfung auf Primzahl, wenn nein - Feld mit 0 füllen
				
				System.out.println(Arrays.toString(feld));
				
				if ((1 + fakultaet(i - 1)) % i > 0) {		 // Prüfung auf Primzahl, wenn ja, aufs nächste Feld springen
					
					feld[i] = 0; 
					
					for(k = 2; k <= xmax; k++ ) {			// leeren aller Nicht-Primzahl-Vielfachen
					
						k = k * i;
							if(k < xmax)  {
								
							feld[k] = 0;  						// leeren des Feldes einer nicht-Primzahl
							
							}
					}
						
				}
		
			}
		}
		System.out.println(Arrays.toString(feld));
	}

}
