package TestNGmavenexemple;

import static org.testng.AssertJUnit.assertEquals;


import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import SmokeTest.Calculator;
import SmokeTest.ICalculator;

import org.testng.annotations.BeforeClass;



@Test (groups = {"requirementEntityKey:PRO-RQ-1", "testEntityKey:PRO-TC-1" }, suiteName  =  " Regression ")
public class CalculatorTest {
	private static ICalculator calculator;

	@BeforeClass
	public static void initCalculator() {
		calculator = new Calculator();
	}

	@BeforeClass
	public void beforeEachTest() {
		System.out.println("This is executed before each Test");
	}

	@AfterClass
	public void afterEachTest() {
		System.out.println("This is exceuted after each Test");
	}

	@Test
	public void testSum() {
		int result = calculator.sum(3, 4);
		assertEquals(7, result);

	}

	@Test
	public void testDivison() {
		try {
			int result = calculator.divison(10, 2);
			System.out.println("testing");
			assertEquals(5, result);
			System.out.println("testing");

		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
	}

}
