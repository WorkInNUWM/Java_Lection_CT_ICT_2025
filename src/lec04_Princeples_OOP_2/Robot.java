package lec04_Princeples_OOP_2;

public class Robot {
	protected String info;
	
	Robot(){
		this.info="Я Robot – я просто працюю";
	}
	
	Robot(String info){
		this.info=info;
	}
	
	public void work() {
		System.out.println(this.info);
	}
	
	public String getInfo() {
		return this.info;
	}
}