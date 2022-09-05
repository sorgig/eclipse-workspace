package project;

public class PosizArray {
	public static void main(String[] args) {
		int[] array = { 3, 4, 6, -2, 18, 4, 9, 0 };
		int target = 4;
		int start = 0;
		int pos = indexOf(array, start, target);

		System.out.println("la posizione e': " + pos);
		int pos2 = indexOf(array, pos + 1, target);
		System.out.println(pos2);
	}

	public static int indexOf(int[] array, int target) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				return i;
			}
		}
		return -1;
	}

	public static int indexOf(int[] data, int begin, int x) {
		for (int i = 0; i < data.length; i++) {
			if (data[i] == x) {
				return i;
			}
		}
		return -1;
	}
}
