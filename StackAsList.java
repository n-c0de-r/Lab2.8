
/**
 * This class takes a Stack and converts it to a Linked List.
 *
 * @author	robinwettstaedt
 * @author	n-c0de-r
<<<<<<< HEAD
 * @version	21-06-03 update 21-06-07
=======
 * @version	21-06-03 update 21-06-06
>>>>>>> 62afd04614efad6bf3d101993bcbf5240b3448bc
 */

//Assignment 2
public class StackAsList implements Stack{
<<<<<<< HEAD

    private Node first;

    /**
     * constructor for the stack as a linked list.
     */
    public StackAsList() {
    }
=======
	
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
>>>>>>> 62afd04614efad6bf3d101993bcbf5240b3448bc

    class Node {
        String data;
        Node next;

<<<<<<< HEAD
        //Constructor of the Node class
        public Node() {
=======
        public boolean hasNext() {
            if (this.next == null) {
                return false;
            }
            else {
                return true;
            }*/
>>>>>>> 62afd04614efad6bf3d101993bcbf5240b3448bc
        }

    }

    /**
     * Insert an element in the beginning of the list,
     * as the top-most element of a stack.
     * @return The String just stored in the Node.
     */
<<<<<<< HEAD
    @Override
    public String push(String element) {

        Node node = new Node();
        node.data = element;
        node.next = first;
        first 	  = node;
        return element;
=======
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
>>>>>>> 62afd04614efad6bf3d101993bcbf5240b3448bc
    }

    /**
     * Gets the first/ top-most element of the list,
     * and removes it from the order and it's linking,
     * @return String stored in the Node's data field.
     */
    @Override
<<<<<<< HEAD
    public String pop() {
        if (first != null) {
            String s = first.data;
            first	 = first.next;
            return s;
        } else {
=======
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
>>>>>>> 62afd04614efad6bf3d101993bcbf5240b3448bc
            return null;
        }*/
    }
<<<<<<< HEAD

    /**
     * Just look into the data field of the top-most Node.
     * * @return String stored in the Node's data field.
     */
    @Override
    public String peek() {
        return first.data;
    }

    /**
     * Check if the list/stack is empty.
     * @return Boolean, true if there are no Nodes in the list.
     */
=======
    
    /*
	@Override
    public String peak() {
        return (String) first.data;
    }
    
>>>>>>> 62afd04614efad6bf3d101993bcbf5240b3448bc
    @Override
    public boolean isEmpty() {
        if (first == null)
            return true;
        return false;
    }*/


    @Override
    public String toString() {
<<<<<<< HEAD

        String s = "";
=======
>>>>>>> 62afd04614efad6bf3d101993bcbf5240b3448bc

        /*if (isEmpty()) {
            return s;
        }

        Node current = first;

        while (true) {
            s = s + "[ " + current.data + " ] ";
            if (current.next == null) {
                break;
            }
            current = current.next;
<<<<<<< HEAD
        }
=======
        }*/
>>>>>>> 62afd04614efad6bf3d101993bcbf5240b3448bc
        return first.data;
    }
}
