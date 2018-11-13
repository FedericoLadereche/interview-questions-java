import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SwapIntegerVariableTest {
	
	private SwapIntegersVariables classUnderTest;

	@BeforeEach
	void setUp() throws Exception {
		classUnderTest = new SwapIntegersVariables();
	}

	@Test
	void test() {
		
		//---------------------------------------Solution 1-----------------------------------
		int firstValue = 0;
		int secondValue = 0;
		
		classUnderTest.SwapValuesSolution1(firstValue, secondValue);
		
		assertEquals(classUnderTest.SECOND_VALUE, firstValue);
		assertEquals(classUnderTest.FIRST_VALUE, secondValue);
		
		firstValue = 1;
		secondValue = 0;
		
		classUnderTest.SwapValuesSolution1(firstValue, secondValue);
		
		assertEquals(classUnderTest.SECOND_VALUE, firstValue);
		assertEquals(classUnderTest.FIRST_VALUE, secondValue);
		
		firstValue = 1000;
		secondValue = 500;
		
		classUnderTest.SwapValuesSolution1(firstValue, secondValue);
		
		assertEquals(classUnderTest.SECOND_VALUE, firstValue);
		assertEquals(classUnderTest.FIRST_VALUE, secondValue);
		
		firstValue = 100;
		secondValue = -100;
		
		classUnderTest.SwapValuesSolution1(firstValue, secondValue);
		
		assertEquals(classUnderTest.SECOND_VALUE, firstValue);
		assertEquals(classUnderTest.FIRST_VALUE, secondValue);
		
		firstValue = -900;
		secondValue = -100;
		
		classUnderTest.SwapValuesSolution1(firstValue, secondValue);
		
		assertEquals(classUnderTest.SECOND_VALUE, firstValue);
		assertEquals(classUnderTest.FIRST_VALUE, secondValue);
		
		//---------------------------------------Solution 2-----------------------------------
		firstValue = 0;
		secondValue = 0;
		
		classUnderTest.SwapValuesSolution2(firstValue, secondValue);
		
		assertEquals(classUnderTest.SECOND_VALUE, firstValue);
		assertEquals(classUnderTest.FIRST_VALUE, secondValue);
		
		firstValue = 1;
		secondValue = 0;
		
		classUnderTest.SwapValuesSolution2(firstValue, secondValue);
		
		assertEquals(classUnderTest.SECOND_VALUE, firstValue);
		assertEquals(classUnderTest.FIRST_VALUE, secondValue);
		
		firstValue = 1000;
		secondValue = 500;
		
		classUnderTest.SwapValuesSolution2(firstValue, secondValue);
		
		assertEquals(classUnderTest.SECOND_VALUE, firstValue);
		assertEquals(classUnderTest.FIRST_VALUE, secondValue);
		
		firstValue = 100;
		secondValue = -100;
		
		classUnderTest.SwapValuesSolution2(firstValue, secondValue);
		
		assertEquals(classUnderTest.SECOND_VALUE, firstValue);
		assertEquals(classUnderTest.FIRST_VALUE, secondValue);
		
		firstValue = -900;
		secondValue = -100;
		
		classUnderTest.SwapValuesSolution2(firstValue, secondValue);
		
		assertEquals(classUnderTest.SECOND_VALUE, firstValue);
		assertEquals(classUnderTest.FIRST_VALUE, secondValue);
		
	}

}
