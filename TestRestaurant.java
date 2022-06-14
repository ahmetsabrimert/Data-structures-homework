package hw3;


public class TestRestaurant {
	
	public static void main(String[] args) {
		

		
		RestaurantWaitListQueueLinkedList l = new RestaurantWaitListQueueLinkedList(100);
		
		
		RestaurantWaitList  A1 = new RestaurantWaitList ("c1", 3.00,1,true);
		RestaurantWaitList  A2 = new RestaurantWaitList ("c2", 3.00,2,false);
		RestaurantWaitList  A3 = new RestaurantWaitList ("c3", 3.00,3,true);
		RestaurantWaitList  A4 = new RestaurantWaitList ("c4", 3.00,4,true);
		RestaurantWaitList  A5 = new RestaurantWaitList ("c5", 3.00,5,false);
		RestaurantWaitList  A6 = new RestaurantWaitList ("c6", 3.00,1,true);
		RestaurantWaitList  A7 = new RestaurantWaitList ("c7", 3.00,2,true);
		RestaurantWaitList  A8 = new RestaurantWaitList ("c8", 3.00,3,false);
		RestaurantWaitList  A9 = new RestaurantWaitList ("c9", 3.10,4,true);
		RestaurantWaitList  A10 = new RestaurantWaitList ("c10", 3.20,5,false);
		RestaurantWaitList  A11 = new RestaurantWaitList ("c11", 3.30,1,true);
		RestaurantWaitList  A12 = new RestaurantWaitList ("c12", 3.40,2,false);
		
		
		
		//12 customers added
		l.enQueue(A1);
		l.enQueue(A2);
		l.enQueue(A3);
		l.enQueue(A4);
		l.enQueue(A5);
		l.enQueue(A6);
		l.enQueue(A7);
		l.enQueue(A8);
		l.enQueue(A9);
		l.enQueue(A10);
		l.enQueue(A11);
		l.enQueue(A12);
		l.print();
		l.updateTable("c2", 5);
		System.out.println("\n\n");
		l.print();
		
	
	
		
		
		                                                                    
		
		System.out.println("Size: "+l.getSize());
		System.out.println("Front: "+l.getFront());
		System.out.println("Rear: "+l.getRear());

		
		System.out.println("Removed Element: " + l.deQueue());
		
		System.out.println("Size: "+l.getSize());
		System.out.println("Front: "+l.getFront());
		System.out.println("Rear: "+l.getRear());
		
		
		System.out.println("Size: "+l.getSize());
		System.out.println("Front: "+l.getFront());
		System.out.println("Rear: "+l.getRear());
		
		System.out.println("Removed Element: " + l.deQueue());
		
		System.out.println("Size: "+l.getSize());
		System.out.println("Front: "+l.getFront());
		System.out.println("Rear: "+l.getRear());
		
	}

	

}
