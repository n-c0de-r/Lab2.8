import java.util.EmptyStackException;

/**
 * This class takes a Stack and converts it to a Linked List.
 * 
 * @author	robinwettstaedt
 * @author	n-c0de-r
 * @version	21-06-03 update 21-06-06
 */

//Assignment 2
public class StackAsList implements Stack{
	
    private Node first;
    //Node last; unnecessary
    
    public StackAsList() {
    	//this(null);  unnecessary
    }
    
    class Node {
        String data;
        Node next;
        //Node previous; unnecessary

        //Constructor of the Node class
        public Node(/*Object nodeData, Node next, Node previous*/) {
            /*this.data = nodeData;
            this.next = next;
            this.previous = previous;

        }

        public boolean hasNext() {
            if (this.next == null) {
                return false;
            }
            else {
                return true;
            }*/
        }

    }

    /**
     * constructor for the stack
     * if stack is supposed to be empty, argument should be null
     * @param firstNode
     */
    /*public StackAsList(Node firstNode) {
        this.first = firstNode;
        this.last = firstNode;
    }  unnecessary */

 

    @Override
    public String push(String element) /*throws StackOverflowError*/ {
          /*try {
              if (isEmpty()) {
                  this.first = new Node(element, null, null);
                  this.last = this.first;
              } else {
                  if (first.next == null) {
                      this.last = new Node(element, null, null);
                      this.first.next = this.last;
                      this.last.previous = this.first;
                  } else {
                      Node oldLast = this.last;
                      this.last = new Node(element, null, oldLast);
                      oldLast.next = this.last;
                  }
              }
              return element;
          }
          catch (Exception e){
            System.out.println("The Stack is full!");
            return null;
        }*/
    	Node node = new Node();
    	node.data = element;
    	node.next = first;
    	first 	  = node;
    	return element;
    }

    @Override
    public String pop() /*throws EmptyStackException*/ {
    	if (first != null) {
    		String s = first.data;
    		first	 = first.next;
    		return s;
    	} else {
    		return null;
    	}
    	/*	
        try {
            Node popped = last;
            last = popped.previous;
            return (String) popped.data;
        }
        catch (Exception e) {
            System.out.println("The stack is already empty!");
            return null;
        }*/
    }
    
    /*
	@Override
    public String peak() {
        return (String) first.data;
    }
    
    @Override
    public boolean isEmpty() {
        if (this.first == null)
            return true;
        return false;
    }*/

    @Override
    public String toString() {

        /*if (isEmpty()) {
            return s;
        }

        Node current = this.first;

        while (true) {
            s = s + "[ " + current.data + " ] ";
            if (current.next == null) {
                break;
            }
            current = current.next;
        }*/
        return first.data;
    }
}
