package project;

public class CodingBat {
	public static boolean sleepIn(boolean weekday, boolean vacation) {
		return vacation || !weekday;
	}

	public static boolean stringE(String str) {
		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'e') {
				counter++;
			}
		}
		return counter >= 1 && counter <= 3;
	}

	public static String front22(String str) {
		int len = Math.min(str.length(), 2);
		String token = str.substring(0, len);
		return token + str + token;
	}

}
