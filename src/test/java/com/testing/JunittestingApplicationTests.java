package com.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class JunittestingApplicationTests {
	private static Calculator calc;
	@BeforeAll
	public static void init() {
		calc=new Calculator();
	}
	@Test
	 void testaddTwoNumbers() {
			int actualValue = calc.addNumbers(10, 20);
			int expectedValue=30;
			assertEquals(expectedValue, actualValue);
	}
	@Test
	@RepeatedTest(5)
	@Disabled
	void testMultiply() {
		int actualValue=calc.multiply(2, 5);
		int expectedValue=10;
		assertEquals(expectedValue, actualValue);
	}
	@AfterAll
	public static void destroy() {
		calc=null;
	}

}
