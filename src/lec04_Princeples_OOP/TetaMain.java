package lec04_Princeples_OOP;

public class TetaMain {

	public static void main(String[] args) {
		Animal cat=new Cat("Siamskiy","Lana",3);

		System.out.println(cat);
		System.out.println(((Cat)cat).getPorodaCat());
		Cat cat1=new Cat("Siamskiy","Lama",5);
		System.out.println(cat1);
		Animal dog=new Dog("Labrador","Garry",6);
		System.out.println(dog);
		cat.eat();
		dog.eat();
	}

}
