import java.util.Scanner;

/**
 * This class takes an arithmetic expression as an input String
 * and converts any infix notation to a postfix one.
 * 
 * @author	robinwettstaedt
 * @author	n-c0de-r
 * @version	21-06-03 updated 21-06-07
 */

//Assignment 5
public class Converter {

	public static void main(String[] args) {
		//create a new postfix object, that provides means of evaluation and conversion
		Postfix p = new Postfix();
		
		boolean running = true;
		
		Scanner s = new Scanner(System.in);
		
		// Similar to Chatterbox Lab
		while (running) {
			System.out.println("Each operand and operator must be separated by spaces!");
			System.out.println("Type 'exit' to terminate.");
			System.out.println();
			System.out.print("Please enter an infix expression: ");
			
			String line = s.nextLine().trim();
			
			if (line.toLowerCase().equals("exit")) {
				running = false;
				System.out.println("");
			} else {
				String inToPost = p.infixToPostfix(line);
				System.out.println();
				System.out.println("The resulting postfix notation is: " + inToPost);
				System.out.println();
				System.out.println("The result of the postfix expression equals to: " +  + p.evaluate(inToPost));
				System.out.println("");
			}
		}
		s.close();
	}
}
