package SourceClasses;
/**
 * @author Manuel Corral Ledezma
 *
 */
public class LinksListeded {
	
	 static Node head;
	 
	//Allows the user to add a node to the list/ add it to the end
		public static void Append(String newItem) {
				Node newNode = new Node(newItem); //Creates a new node based off of users input
				newNode.next = null;
				
				if(head == null) { //Checks if we are adding in the first node, if we are set this node to head
					head = newNode;
				}
				else { // else just add the node to the end
					Node temp = head;
					while(temp.next!= null) {
						temp = temp.next;
					}
					temp.next = newNode;
				}
			}
	  
	    // Method to print the list
	    public static void printList(LinksListeded list) 
	    { 
	        Node cNode = head; 
	   
	        System.out.print("Items in the list: "); 
	   
	        // This will travel through the node
	        while (cNode != null) { 
	            // Prints the current indexs item 
	            System.out.print(cNode.item + " "); 
	   
	            // Moves unto the next node 
	            cNode = cNode.next; 
	        } 
	    }
	    
	    //Search Algoritim that will go through the list until it finds the position requested and gives the user the item
	    public static String searchList(LinksListeded list, int itemPosition) {
	    	
	    	Node cNode = head;
	    	int iterator = 0;
	    	
	        while (cNode != null) { 
	            
	          
	            if(iterator == itemPosition) {
	            	break;
	            }
	            iterator++;
	            // Moves unto the next node
	            cNode = cNode.next;
	           
	        } 
	    	return cNode.item;
	    }
}
