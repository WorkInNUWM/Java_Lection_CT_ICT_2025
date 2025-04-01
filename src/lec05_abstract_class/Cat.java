package lec05_abstract_class;

public class Cat extends Pet{
	private String name;
	
	
	public Cat() {
		super();
		this.name = "NoName";
	}
	
	public Cat(String name) {
		super();
		this.name = name;
	}

	@Override
	public void voice() {
		System.out.println(this.info+"=>"+this.name+" has voice: Myau-Myau");
	}
	
	@Override
	public void eat() {
		System.out.println("Meat, Milk");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + "]";
	}

	

}
