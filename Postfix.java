
/**
 * This class takes a infix arithmetic expression as a
 * String and converts it to postfix notation.
 * 
 * @author	robinwettstaedt
 * @author	n-c0de-r
 * @version	21-06-03 
 */

//Assignment 3
public class Postfix {
	
	//TODO Class body
	
	public int evaluate (String pfx) {
		//variables holding left-hand side and right-hand side of an expression
		int lhs;
		int rhs;
		
		Stack s = new StackAsList();
		
		//Variables to hold substrings
		String first;
		
		//Variable holding the result
		int r = 0;
		
		//While the array is not looped through
		int i = 0;
		while (i < pfx.length()) {
			first = pfx.substring(i,i+1);
			
			switch (first) {
				case "+":
					rhs = Integer.parseInt(s.pop());
					lhs = Integer.parseInt(s.pop());
					r = lhs + rhs;
					break;
				case "-":
					rhs = Integer.parseInt(s.pop());
					lhs = Integer.parseInt(s.pop());
					r = lhs - rhs;
					break;
				case "*":
					rhs = Integer.parseInt(s.pop());
					lhs = Integer.parseInt(s.pop());
					r = lhs * rhs;
					break;
				case "/":
					rhs = Integer.parseInt(s.pop());
					lhs = Integer.parseInt(s.pop());
					r = lhs / rhs;
					break;
				case "^":
					rhs = Integer.parseInt(s.pop());
					lhs = Integer.parseInt(s.pop());
					r = (int) Math.pow(lhs,  rhs);
					break;
				default:
					s.push(first);
			}
			i++;
		}
		s.push(Integer.toString(r));
		return r;
	}
	
	// Assignment 4
//	public String infixToPostfix (String ifx){
//		//TODO method body
//		return "result";
//	}

}
