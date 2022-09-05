package project;

public class Break {
	public static void main(String[] args) {
		int[] array = { -8, 4, 2 - 5, 3, 0 };

		// stiamo usando un booleano per trovare i valori
		// negativi o positivi senza dover mettere una variabile da incremetare
		boolean found = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				found = true;
				break;
			}
		}
		if (found) {
			System.out.println("o.k.");
		} else {
			System.out.println("k.o.");
		}
	}
}
