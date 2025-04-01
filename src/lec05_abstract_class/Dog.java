package lec05_abstract_class;

public class Dog  extends Pet{

	@Override
	public void voice() {
		System.out.println("Gav-Gav");
	
	}
	
	public void eat() {
		System.out.println("Meat, Fish");
	}

	@Override
	public String toString() {
		return "Dog []";
	}
	
}
