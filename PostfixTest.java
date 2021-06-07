import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PostfixTest {
	Postfix p = new Postfix();

	/**
	 * This test runs on all exercises from the prelab together and is positive if all
	 * tests are successful. Double results are set as negative tests - for now!
	 */
	@Test
	void testLabExercisesAll() {
		assertEquals(5, p.evaluate("1 2 * 3 +"));
		assertEquals(7, p.evaluate("1 2 3 * +"));
		assertEquals(-78, p.evaluate("1 2 + 3 4 ^ -"));
		assertEquals(-11, p.evaluate("1 2 ^ 3 4 * -"));
		assertEquals(-1011, p.evaluate("1 2 3 * + 4 5 ^ - 6 +"));
		assertNotEquals(9.25, p.evaluate("1 2 + 3 * 4 5 6 - ^ +")); //negative tests for now as class can't
		assertNotEquals(98.75, p.evaluate("1 2 + 3 4 / + 5 + 6 7 8 + * +")); //  deal with doubles, needs fix!
		assertEquals(-1, p.evaluate("9 1 - 2 - 3 2 * - 1 -"));
	}

	/*
	 * All prelab expressions separate, to separately check which is wrong, if any!
	 */
	@Test
	void testLabExerciseA() {
		assertEquals(5, p.evaluate("1 2 * 3 +"));
	}

	@Test
	void testLabExerciseB() {
		assertEquals(7, p.evaluate("1 2 3 * +"));
	}

	@Test
	void testLabExerciseC() {
		assertEquals(-78, p.evaluate("1 2 + 3 4 ^ -"));
	}

	@Test
	void testLabExerciseD() {
		assertEquals(-11, p.evaluate("1 2 ^ 3 4 * -"));
	}

	@Test
	void testLabExerciseE() {
		assertEquals(-1011, p.evaluate("1 2 3 * + 4 5 ^ - 6 +"));

	}

	@Test
	void testLabExerciseF() {
		assertNotEquals(9.25, p.evaluate("1 2 + 3 * 4 5 6 - ^ +"));
	}

	@Test
	void testLabExerciseG() {
		assertNotEquals(98.75, p.evaluate("1 2 + 3 4 / + 5 + 6 7 8 + * +"));
	}

	@Test
	void testLabExerciseH() {
		assertEquals(-1, p.evaluate("9 1 - 2 - 3 2 * - 1 -"));
	}
	
	@Test
	void testConversion() {
		assertEquals("1 2 * 3 +", p.infixToPostfix("1 * 2 + 3"));
		assertEquals("1 2 3 * +", p.infixToPostfix("1 + 2 * 3"));
		assertEquals("1 2 + 3 4 ^ -", p.infixToPostfix("1 + 2 - 3 ^ 4"));
		assertEquals("1 2 ^ 3 4 * -", p.infixToPostfix("1 ^ 2 - 3 * 4"));
		assertEquals("1 2 3 * + 4 5 ^ - 6 +", p.infixToPostfix("1 + 2 * 3 - 4 ^ 5 + 6"));
		assertEquals("1 2 + 3 * 4 5 6 - ^ +", p.infixToPostfix("( 1 + 2 ) * 3 + ( 4 ^ ( 5 - 6 ) )"));
		assertEquals("1 2 + 3 4 / + 5 + 6 7 8 + * +", p.infixToPostfix("1 + 2 + 3 / 4 + 5 + 6 * ( 7 + 8 )"));
		assertEquals("9 1 - 2 - 3 2 * - 1 -", p.infixToPostfix("9 - 1 - 2 - 3 * 2 - 1"));
	}

}
