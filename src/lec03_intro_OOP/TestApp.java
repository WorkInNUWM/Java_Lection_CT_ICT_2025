package lec03_intro_OOP;

public class TestApp {

	public static void main(String[] args) {
		Animal monkey1=new Animal();
//		System.out.println("type: "+monkey1.type+" name: "+monkey1.name+" age: "+monkey1.age);
		monkey1.setType("gorila");
		monkey1.setColor("gray");
		monkey1.setName("judy");
		monkey1.setAge(-100);
		System.out.println(monkey1);
		System.out.println("type: "+monkey1.getType()+" name: "+monkey1.getName());
		
		Animal monkey2=new Animal("shimpanze","Toto",9,"gray");
		System.out.println("type: "+monkey2.getType()+" name: "+monkey2.getName()+" age: "+monkey2.getAge());
		System.out.println(monkey2);
		System.out.println("Count animals=> "+Animal.count);
		Animal wolf1=new Animal("wolf","Alpha",10,"gray");
		System.out.println("Count animals=> "+Animal.count);
		Animal [] zoo=new Animal[3]; 
		zoo[0]=monkey1;
		zoo[1]=monkey2;
		zoo[2]=wolf1;
		System.out.println("=====================ZOO========================");
		for (int i = 0; i < zoo.length; i++) {
			System.out.println(zoo[i]);
		}
		System.out.println("=====================ZOO (animal (>8 age))========================");
		int findByAge=8;
		for (int i = 0; i < zoo.length; i++) {
			if (zoo[i].getAge()>8) {
				System.out.println(zoo[i]);
			}
		}
		
		
		System.out.println("=====================ZOO (AVG age)========================");
		int suma=0;
		for (int i = 0; i < zoo.length; i++) {
			suma+=zoo[i].getAge();
		}
		
		System.out.printf("AVG age of animals => %10.3f years old!",suma/(float)zoo.length);
		
		
	}

}
