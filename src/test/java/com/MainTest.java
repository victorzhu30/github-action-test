package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void addsTwoPositiveNumbers() {
		Main main = new Main();
		int result = main.add(1, 1);
		assertEquals(2, result);
	}

	@Test
	void throwsIllegalArgumentWhenANegative() {
		Main main = new Main();
		assertThrows(IllegalArgumentException.class, () -> main.add(-1, 5));
	}

	@Test
	void throwsIllegalArgumentWhenBNegative() {
		Main main = new Main();
		assertThrows(IllegalArgumentException.class, () -> main.add(5, -1));
	}

	@Test
	void throwsArithmeticWhenOverflow() {
		Main main = new Main();
		assertThrows(ArithmeticException.class, () -> main.add(Integer.MAX_VALUE, 1));
	}

	@Test
	void addsAtOverflowBoundary() {
		Main main = new Main();
		int result = main.add(Integer.MAX_VALUE - 1, 1);
		assertEquals(Integer.MAX_VALUE, result);
	}

}
