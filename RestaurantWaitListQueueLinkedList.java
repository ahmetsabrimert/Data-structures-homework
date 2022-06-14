package hw3;


public class RestaurantWaitListQueueLinkedList {
	
	
	Node head;
	Node tail;
	
	int size;//player who stay on the linked list
	int capacity;//capacity of linked list
	
	RestaurantWaitList customerinturn =null;
	

	 public RestaurantWaitListQueueLinkedList(int capacity) {
	        this.capacity = capacity;
	        this.size = 0;
	}
		
	
	 // for printing  Linked List forward
	    public void print() {

	        Node current = head;
	        while (current != null) {
	            current.displayNodeData();
	            current = current.next;
	        }
	        System.out.println();
	    }
	 
	    //showing the linked list
	 public void show(RestaurantWaitList customer) {
			System.out.println("Elements  :  ");
			
			 Node active = head;
			 active = active.next;
			 System.out.println(active+ " ");
			
		}
			
		//create new node
	public Node getNewNode(RestaurantWaitList customer) {
			Node n = new Node();
			n.customer=customer;
			n.next=null;
			return n;
		}
	 
	//adding queue
	 public void enQueue(RestaurantWaitList customer) {
		 if(tail==null) {
			 head=tail=getNewNode(customer);
			 size++;
			 return;
			 
	}
		 size++;
		 tail.next=getNewNode(customer);
		 tail=tail.next;
		 
}
		
	 
	 public boolean isEmpty() {
			if(tail==null) {
				return true;
			}
			return false;
		}
		
	 
	public RestaurantWaitList deQueue() {
		 if(isEmpty()) {
			 System.out.println("Queue is empty..");
			 return null;
			 }
		 size--;
		 
		 RestaurantWaitList t =head.customer;
		 head =head.next;
		 
		 if(head==null) {
			 tail=null;
		 }
		 return t;
	 }
	
	//for updating table's number
    public RestaurantWaitList updateTable(String numbers,int newTable) {
   	 	
        Node active = head;
        RestaurantWaitList updatedCustomer=null;
       
        do{
       	 
    		active = active.next;
    		
    		updatedCustomer =active.customer;
    			
    			
         if (updatedCustomer.happy==false) {
       	  
        	 updatedCustomer.setTable(newTable);
         }             
         
         return updatedCustomer;
        }while (active.customer.tableInfo!= newTable);			

      }
    
       // arrival time comparison
    public RestaurantWaitList inQueue(RestaurantWaitList customer ) {
		
    	Node active =head;
    	
    	
		
		if(size==4) {
			active=active.next;
			
			while(active.equals(tail)) {
	           
				if(active.customer.getTime()<active.next.customer.getTime()) {
					customerinturn = active.customer;
	            	size--;
	            	return customerinturn;
	            	
	            }  
	            else if(active.customer.getTime()>active.next.customer.getTime()) {
	            	customerinturn = active.next.customer;
	            	size--;
	            	return customerinturn;
	            }
	        	else {
	    			System.out.println("Arrival times are equal,the first to come in is taken first ...");
	    		}
	            	                   
	       }
	}
		return null;
		
 }		
		
		
	
    
		//Only for customers who 75 to stay
    public void enterQueue(RestaurantWaitList customer) {
    	Node active = head;
    	
       
    	while(size!=1) {
        while(active!=null) {
        		deQueue();
        		show(customer);
    			 
        		active = active.next;
        		if(active.customer.getHappy()==false) {
    			enQueue(customer);
    			
    			 }
    	}
    }
       
 }
    // calculating waiting time
    public double waitingTime(RestaurantWaitList customer) {
    	
    	Node active = head;
    	RestaurantWaitList updatedArrival=null;
    	double waitingtime = 0;
        
         
    	updatedArrival =active.customer;
    	
    			
    			
         if (updatedArrival.getTime() > active.prev.customer.getTime()) {
        	 waitingtime = updatedArrival.getTime() - active.next.customer.getTime();
         }             
         
         return waitingtime;		

      }    	
    	
    	
    	
    
    
    
    public int getSize() {
		 return size;
	 }
	 
	
	 // printing head element of the linked list
	 public RestaurantWaitList getFront() {
		 if(isEmpty()) {
			 System.out.println("Queue is empty.Nothing at Front..");
			 return null;
			 
		 }
		 return head.customer;
	 }
	 
	//printing tail element of the linked list
	 public RestaurantWaitList getRear() {
		 if(isEmpty()) {
			 System.out.println("Queue is empty.Nothing at Rear..");
			 return null;
			 
		 }
		 return tail.customer;
	 }

}
