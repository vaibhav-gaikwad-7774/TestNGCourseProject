package com.telusko.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalcTest {

	@Test
	void test() {
		Calc c = new Calc();
		int actual = c.divide(10, 5);
		int expectedResult = 2;
		assertEquals(expectedResult, actual);
	}

}