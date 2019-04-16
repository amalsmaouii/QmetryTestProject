package TestNGmavenexemple;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test (groups = {"testEntityKey:PRO-TC-18"})

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
	
	
	@Test (priority = 1)
	public void testSum() {
		int result = calculator.sum(3, 4);

		assertEquals(7, result);
	}

	@Test  (priority = 2)

	public void testDivison() {
		try {
			int result = calculator.divison(10, 2);

			assertEquals(5, result);
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
	}
}
