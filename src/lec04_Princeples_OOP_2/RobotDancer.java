package lec04_Princeples_OOP_2;

public class RobotDancer extends Robot {
	private String kindOfDancer; 
	
	public RobotDancer(){
		super("I am RobotDancer and I am dancing");
		this.kindOfDancer="universal dance";
		
	}
	
	public RobotDancer(String kindOfDancer){
		super("I am RobotDancer and I am dancing");
		this.kindOfDancer=kindOfDancer;
		
	}
	
	public RobotDancer(String info,String kindOfDancer ){
		super(info);
		this.kindOfDancer=kindOfDancer;
		
	}
	
	
	//поліморфізм
	
	@Override
	public void work() {
		super.work();
		System.out.println("Kind of dance => "+this.kindOfDancer);
	}

//	@Override
//	public String toString() {
//		return "RobotDancer [kindOfDancer=" + kindOfDancer + "]";
//	} 
	
	

}
