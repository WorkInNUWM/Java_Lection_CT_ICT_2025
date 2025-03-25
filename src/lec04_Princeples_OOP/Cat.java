package lec04_Princeples_OOP;

public class Cat extends Animal{
	private String porodaCat;

	public Cat() {
		super();
	}
	public Cat(String porodaCat, String name, int age) {
		super("Cat",name, age);
		this.porodaCat = porodaCat;
		
	}
	public String getPorodaCat() {
		return porodaCat;
	}
	public void setPorodaCat(String porodaCat) {
		this.porodaCat = porodaCat;
	}
	@Override
	public String toString() {
		return "Cat porodaCat=" + porodaCat + " ["+super.toString()+"]";
	}
	
	@Override
	public void eat() {
		System.out.println(super.getName()+" eat fish!");
	}
	

}
