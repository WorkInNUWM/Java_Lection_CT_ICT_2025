package lec04_Princeples_OOP;

public class Dog extends Animal {
	private String vidDog;

	public Dog() {
		super();

	}

	public Dog(String vidDog, String name, int age) {
		super("Dog", name, age);
		this.vidDog = vidDog;
	}

	public String getVidDog() {
		return vidDog;
	}

	public void setVidDog(String vidDog) {
		this.vidDog = vidDog;
	}

	@Override
	public String toString() {
		return "Dog [vidDog=" + vidDog + ", " + super.toString() + "]";
	}

	@Override
	public void eat() {
		System.out.println("Dog "+super.getName()+" eat meat!");
	}
}
