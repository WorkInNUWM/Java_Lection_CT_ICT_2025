package lec05_abstract_class;

public class TastApp {
	public static void main(String[] args) {
		Pet pet1=new Cat();
//		Pet pet1=new Pet(); //ERROR!!!
		pet1.eat();
		pet1.voice();
		Cat catPushok=new Cat();
		Cat catTom=new Cat("Tom");
		Dog dogChapa=new Dog();
//		dogChapa.name="Cahapa";
		MyPetList myPets= new MyPetList();
		myPets.add(catPushok); //[0]
		myPets.add(dogChapa);  //[1]
		myPets.add(catTom);  //[2]
//		System.out.println(myPets);
		myPets.infoPets();
	}
}
