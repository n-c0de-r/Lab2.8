
/**
 * This class takes an arithmetic expression as an input String
 * and converts any infix notation to a postfix one.
 * 
 * @author	robinwettstaedt
 * @author	n-c0de-r
 * @version	21-06-03 
 */

//Assignment 5
public class Converter {

	public static void main(String[] args) {
		//create a new postfix object, that provides means of evaluation and conversion
		Postfix p = new Postfix();
		
		//System.out.println(p.evaluate("1 2 * 3 +")); checking if postfix works, obsolete with tests
		
		System.out.println("Please enter an infix expression.");
		System.out.println("Each operand and operator must be separated by spaces!");
		// Like in Chatterbox Lab
		Scanner s = new Scanner(System.in);
		System.out.println();
		System.out.println("The resulting postfix notation is: " + p.infixToPostfix(s.nextLine().trim()));
		System.out.println();
		System.out.println("The result of the postfix expression equals to: " +  + p.evaluate(p.infixToPostfix(s.nextLine().trim())));
		s.close();
	}

}
