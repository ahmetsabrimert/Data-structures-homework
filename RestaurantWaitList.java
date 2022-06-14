package hw3;


public class RestaurantWaitList {

	
RestaurantWaitList customer;
	
	String numbers; //customer's number
    double arrivaltime; 
    double waitingtime;
    int tableInfo=1;   // table number
    boolean happy;  // customer happiness about the table
    

   
  //We create a constructor method to access class informations from test class
	public RestaurantWaitList(String no, double time,int table,boolean happy) {
        this.numbers = no;
        this.arrivaltime = time;
        this.tableInfo = table;
        this.happy = happy;
    }

	@Override
    public String toString() {
		
		
		return "Customer [number=" + numbers + ", arrival time=" + arrivaltime +"pm" + ", waiting time="+ waitingtime + ", table number="+ tableInfo +"]";
		 	
	}
	 
	
	//getter and setter methods
  public String getNo() {
        return numbers;

    }

    public void setNo(String no) {
        this.numbers = no;
    }

    public double getTime() {
        return arrivaltime;
    }

    public void setTime(double time) {
        this.arrivaltime = time;
    }
    
    
    public int getTable() {
        return tableInfo;
    }
    
    public void setTable(int table) {
        this.tableInfo = table;
    }
    
    public boolean getHappy() {
        return happy;
    }
    
    public void setHappy(boolean happy) {
        this.happy = happy;
    }

}
