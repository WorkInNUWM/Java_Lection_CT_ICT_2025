package lec05_abstract_class;

 public abstract class Pet { 
	public String info="Pet";
    public abstract void voice();
	public void eat() {
		System.out.println("Pet can eat");
	}
}
