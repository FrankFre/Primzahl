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

	// Berechnung der Fakultät
	private static long fakultaet(long fak) {

		long reihe = 1;

		if (fak > 1) {
			for (int a = 2; a <= fak; a++) {
				reihe = reihe * a;
			}

		}
		return reihe;
	}

	// Erzeugung der Primzahlen nach beschriebener Methode
	private static void erzeugen(int xmax) {

		int i, j, k, l;
		int zaehler = 0;
		int[] feld = new int[xmax + 1];

		// Füllen des Arrays mit einer Zahlenreihe, Index entspricht den enthaltenen
		// Wert
		for (i = 1; i <= xmax; i++) {
			feld[i] = i;
		}
	

		
		// Iteration durch das Array
		for (j = 2; j <= xmax; j++) {
			
			
//			System.out.println(Arrays.toString(feld));
			
			// leeren aller Vielfachen für alle höheren Werte
			for (k = 2; k <= xmax; k++) {

				l = j * k;
//				System.out.println(l);
				if (l <= xmax) {

					// leeren des Feldes einer nicht-Primzahl
				feld[l] = 0;
			
				} 
			}
			
			// Abfrage, ob das Feld durch Berechnung des Vielfachen schon gelöscht wurde,
			if (feld[j] == 0 && j < xmax) {
				j++;
				
			}

			// Prüfung auf Nicht-Primzahl, wenn ja, mit Null füllen
			zaehler++;
			if ((1 + fakultaet(j - 1)) % j > 0) {

				feld[j] = 0;
					
			}

		}
		System.out.println(Arrays.toString(feld));
//		System.out.println("Anzahl der Primzahl-Berechnungen: " + zaehler);
	}

}
