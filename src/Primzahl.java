import java.util.Arrays;
import java.util.Scanner;

public class Primzahl {

	public static void main(String[] args) {

		int xmax;
		int x = 2;

		Scanner eing = new Scanner(System.in);

//		System.out.println("Ermittlung von Primzahlen nach dem Sieb des Eratosthenes ");
//		System.out.print("Bitte geben sie den Zahlenbereich an: ");
//		xmax = eing.nextInt();

		erzeugen(3);

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

		int i;
		int[] feld = new int[xmax + 1];

		// Füllen des Arrays mit einer Reihe von Werten
		for (i = 2; i <= xmax; i++) {
			feld[i] = i;
		}

		i = 2;

		while (feld[i] > 1 && i <= xmax) { // Abfrage, ob das Feld gelöscht wurde, Iteration durch Array

			for (int j = 2; j <= i; j++) { // Prüfung auf Primzahl, wenn nein - Feld mit 0 füllen

				if (i % (1 + fakultaet(i - 1)) != 0) { // Prüfung auf Primzahl, wenn ja, aufs nächste Feld springen

					feld[i] = 0; // leeren des Feldes einer nicht-Primzahl

				}

				System.out.println(Arrays.toString(feld));
				i++;
			}
		}
	}

}
