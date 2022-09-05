package project;

public class EsercizioContinue {
	public static void main(String[] args) {
		int[] array = { 3, 7, -9, 0, 5, 87 };
		int sum = 0;
		int counter = 0;
		// stampa tutti i valori non negativi (pure zero)
		// fai somma dei positivi
		// conta quanti 0 ci sono
		// stampare tutti i valori tranne gli zero
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				sum += array[i];
			}
			if (array[i] == 0) {
				counter++;
				continue;
			}
			System.out.println(array[i] + " ");
		}
		System.out.println("somma dei positivi: " + sum);
		System.out.println("il numero di zeri e': " + counter);
	}

}
