
/**
 * This class takes a infix arithmetic expression as a
 * String and converts it to postfix notation.
 * 
 * @author	robinwettstaedt
 * @author	n-c0de-r
 * @version	21-06-03 update 21-06-06
 */

//Assignment 3
public class Postfix {
	
    /**
     * Evaluate the value of an expression in Reverse Polish Notation/Postfix
     * @param pfx 	String containing the expression
     * @return		Integer value of the given expression
     */
	public int evaluate (String pfx) {
		//variables holding left-hand side and right-hand side of an expression
		int lhs = 0;
		int rhs = 0;
		
		Stack s = new StackAsList();
		
		//Variables to hold substrings
		String first;
		
		//Variable holding the result
		int r = 0;
		
		//While the array is not looped through
		int i = 0;
		while (i < pfx.length()) {
			//Divide the arithmetic expression string and look into the first element.
			first = pfx.substring(i,i+1);
			
			//If it is an operator, take the first two operands from the stack and calculate them accordingly
			if (first == "+" || first == "-" || first == "*" || first == "/" || first == "^") {
				//Store the operands in respective sides
				rhs = Integer.parseInt(s.pop());
				lhs = Integer.parseInt(s.pop());
				
				//Do following calculations depending on found operator
				switch (first) {
				case "+":
					r = lhs + rhs;
					break;
				case "-":
					r = lhs - rhs;
					break;
				case "*":
					r = lhs * rhs;
					break;
				case "/":
					r = lhs / rhs;
					break;
				case "^":
					r = (int) Math.pow(lhs,  rhs);
					break;
			}
				//Push the result to the stack
				s.push(Integer.toString(r));
			} else {
				//If it's an operand push it on top of the stack
				s.push(first);
			}
			//When done with the current token, move on
			i++;
		}
		// When finished return the resulting integer
		return r;
	}
	
    /**
     * Convert any standard arithmetic expression from infix
     * notation to Reverse Polish Notation /Postfix
     * @param pfx 	String containing the expression to convert
     * @return 		String of the resulting postfix expression
     */
	// Assignment 4
//	public String infixToPostfix (String ifx){
//		//TODO method body
//		return "result";
//	}

}
