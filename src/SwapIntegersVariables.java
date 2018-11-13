/**
 * 
 * @author federico.ladereche
 * How to swap two Integers without using temporary variable in Java?
 * Beauty of this question lies both on trick to think about how you can swap two numbers with out third variable, but also problems associated with each approach. 
 * If a programmer can think about integer overflow and consider that in its solution then it creates a very good impression in the eye of interviewers.
 * You can swap numbers by performing some mathematical operations e.g. addition and subtraction and multiplication and division, but they face problem of integer overflow.
 * There is a neat trick of swapping number using XOR bitwise operator which proves to be ultimate solution. 
 *
 */
public class SwapIntegersVariables {
	
	public static int FIRST_VALUE;
	public static int SECOND_VALUE;
	

	/**
	 * This function swaps the values stored in firstValue and secondValue respectively using add and subtract operations.
	 * @param firstValue any integer value
	 * @param secondValue any integer value
	 */
	public void SwapValuesSolution1(int firstValue, int secondValue) {
		
		FIRST_VALUE = firstValue;
		SECOND_VALUE = secondValue;
		
		FIRST_VALUE = FIRST_VALUE + SECOND_VALUE;
		SECOND_VALUE = FIRST_VALUE - SECOND_VALUE;
		FIRST_VALUE = FIRST_VALUE - SECOND_VALUE;
		
		//Another way of representing the previous code 
		//FIRST_VALUE = (FIRST_VALUE + SECOND_VALUE) - (SECOND_VALUE = firstValue);

	}
	
	/**
	 * Solution XOR which is denoted by ^. 
	 * XOR truth table shows A XOR B will return 1 if A and B are different and 0 if A and B are same. 
	 * This property gives birth to following code, popularly know as XOR trick.
	 * 
	 * --------------------------------
	 *| X            Y       | RESULTS  |
	 * --------------------------------
	 *| 1010    ^    0011    = 1001 -> x|
	 *| 1001    ^    0011    = 1010 -> y|
	 *| 1001    ^    1010    = 0011 -> x|
	 * ---------------------------------
	 * 
	 * @param firstValue any integer value
	 * @param secondValue any integer value
	 */
	public void SwapValuesSolution2(int firstValue, int secondValue) {
		
		FIRST_VALUE = firstValue;
		SECOND_VALUE = secondValue;
		
		FIRST_VALUE = FIRST_VALUE ^ SECOND_VALUE;
		SECOND_VALUE = FIRST_VALUE ^ SECOND_VALUE;
		FIRST_VALUE = FIRST_VALUE ^ SECOND_VALUE;
		
		
	}

}
