package project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CodingBatTest {

	@Test
	void sleepInFirst() {
		boolean weekday = false;
		boolean vacation = false;
		boolean expected = true;
		boolean actual = CodingBat.sleepIn(weekday, vacation);
		assertEquals(actual, expected);
	}

	@Test
	void stringEEmpty() {
		String input = "";
		boolean expected = false;
		boolean actual = CodingBat.stringE(input);
		assertEquals(expected, actual);
	}

	@Test
	void stringEOne() {
		String input = "ghtyiscesfiopj";
		boolean expected = true;
		boolean actual = CodingBat.stringE(input);
		assertEquals(expected, actual);
	}

	@Test
	void stringEFour() {
		String input = "geetyiscesfiepj";
		boolean expected = false;
		boolean actual = CodingBat.stringE(input);
		assertEquals(expected, actual);
	}

	@Test
	void front22empty() {
		String input = "";
		String expected = "";
		String actual = CodingBat.front22(input);
		assertEquals(expected, actual);
	}

	@Test
	void front22hi() {
		String input = "hi";
		String expected = "hihihi";
		String actual = CodingBat.front22(input);
		assertEquals(expected, actual);
	}

	@Test
	void front22x() {
		String input = "x";
		String expected = "xxx";
		String actual = CodingBat.front22(input);
		assertEquals(expected, actual);
	}

	@Test
	void front22ciao() {
		String input = "ciao";
		String expected = "ciciaoci";
		String actual = CodingBat.front22(input);
		assertEquals(expected, actual);
	}
}
