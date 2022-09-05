package project;

public class Eserciziomio {
	public static void main(String[] args) {

		int[] array = { 5, 23, 0, -4, 87, -7, -9, 0, 12, -8, -2 };
		int positivi = 0;
		int negativi = 0;
		int zeri = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				System.out.println("il numero e' positivo ed e': " + array[i]);
				positivi++;
			} else if (array[i] < 0) {
				System.out.println("il numero e' negativo ed e': " + array[i]);
				negativi++;
			} else if (array[i] == 0) {
				System.out.println("il numero e' zero");
				zeri++;
			}
		}
		System.out.println(
				"Ci sono " + positivi + " numeri positivi, " + negativi + " numeri negativi e " + zeri + " zeri");
	}

}
