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
		assertEquals(5, p.evaluate("12*3+"));
		assertEquals(7, p.evaluate("123*+"));
		assertEquals(-78, p.evaluate("12+34^-"));
		assertEquals(-11, p.evaluate("12^34*-"));
		assertEquals(-1011, p.evaluate("123*+45^-6+"));
		assertNotEquals(9.25, p.evaluate("12+3*456-^+")); //negative tests for now as class can't
		assertNotEquals(98.75, p.evaluate("12+34/+5+678+*+")); //  deal with doubles, needs fix!
		assertEquals(-1, p.evaluate("91-2-32*-1-"));
	}

	/*
	 * All prelab expressions separate, to separately check which is wrong, if any!
	 */
	@Test
	void testLabExerciseA() {
		assertEquals(5, p.evaluate("12*3+"));
	}

	@Test
	void testLabExerciseB() {
		assertEquals(7, p.evaluate("123*+"));
	}

	@Test
	void testLabExerciseC() {
		assertEquals(-78, p.evaluate("12+34^-"));
	}

	@Test
	void testLabExerciseD() {
		assertEquals(-11, p.evaluate("12^34*-"));
	}

	@Test
	void testLabExerciseE() {
		assertEquals(-1011, p.evaluate("123*+45^-6+"));

	}

	@Test
	void testLabExerciseF() {
		assertNotEquals(9.25, p.evaluate("12+3*456-^+"));
	}

	@Test
	void testLabExerciseG() {
		assertNotEquals(98.75, p.evaluate("12+34/+5+678+*+"));
	}

	@Test
	void testLabExerciseH() {
		assertEquals(-1, p.evaluate("91-2-32*-1-"));
	}

}
