
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
		// TODO Auto-generated method stub
		
		Postfix p = new Postfix();
		
		System.out.println(p.evaluate("1 2 * 3 +"));
		
		//Probably a Scanner to take inputs and pass it to be converted?
	}

}
