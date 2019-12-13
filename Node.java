package SourceClasses;


/**
 * @author Manuel Corral
 *
 */
public class Node {


	public Node next; //This will store the location of the next node
	public String item; // this is what the current node will store
	//Creates a new node with the data the user passes
	public Node(String newItem) {
		this.item = newItem; // node will store the items data
		this.next = null; //since its the newest node it doesnt currently know the nexts nodes location
		}


}
