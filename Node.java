package hw3;



public class Node {
	
	
	public RestaurantWaitList customer; 
	Node next;
	Node prev;

    public void displayNodeData() {
        System.out.println("{ " + customer + " } ");
    }

}
