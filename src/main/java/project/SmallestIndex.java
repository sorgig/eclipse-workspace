package project;

public class SmallestIndex {
	public static void main(String[] args) {
		int[] array = { 3, 8, 36, 82, -5, 6, -75 };
		int pos = posMinimo(array);

		System.out.println(pos + " " + array[pos]);
	}

	public static int posMinimo(int[] array) {
		int pos = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < array[pos]) {
				pos = i;
			}
		}
		return pos;
	}

}
