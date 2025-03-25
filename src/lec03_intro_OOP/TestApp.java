package lec03_intro_OOP;

import java.util.Arrays;
import java.util.Scanner;

public class TestApp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Animal monkey1 = new Animal();
//		System.out.println("type: "+monkey1.type+" name: "+monkey1.name+" age: "+monkey1.age);
		monkey1.setType("gorila");
		monkey1.setColor("gray");
		monkey1.setName("judy");
		monkey1.setAge(-100);
		System.out.println(monkey1);
		System.out.println("type: " + monkey1.getType() + " name: " + monkey1.getName());

		Animal monkey2 = new Animal("shimpanze", "Toto", 9, "gray");
		System.out.println("type: " + monkey2.getType() + " name: " + monkey2.getName() + " age: " + monkey2.getAge());
		System.out.println(monkey2);
		System.out.println("Count animals=> " + Animal.count);
		Animal wolf1 = new Animal("wolf", "Alpha", 10, "gray");
		System.out.println("Count animals=> " + Animal.count);
		Animal[] zoo = new Animal[3];
		zoo[0] = monkey1;
		zoo[1] = monkey2;
		zoo[2] = wolf1;
		// заповнення елементів масиву введенням з клавіатури
//		Animal[] zooRivne = new Animal[3];
//		for (int i = 0; i < zoo.length; i++) {
//			Animal animal = new Animal();
//			System.out.print("Input type:");
//			animal.setType(in.next());
//			System.out.print("Input name:");
//			animal.setName(in.next());
//			System.out.print("Input age:");
//			animal.setAge(in.nextInt());
//			System.out.print("Input color:");
//			animal.setColor(in.next());
//		}
//		System.out.println("=====================ZOO RIVNE========================");
//		for (int i = 0; i < zooRivne.length; i++) {
//			System.out.println(zooRivne[i]);
//		}

		Animal[] zooKiyv = { new Animal("wolf", "Alpha", 10, "gray"), new Animal("wolf", "Omega", 8, "gray") };

		System.out.println("=====================ZOO========================");
		for (int i = 0; i < zoo.length; i++) {
			System.out.println(zoo[i]);
		}
		System.out.println("=====================ZOO (animal (>8 age))========================");
		int findByAge = 8;
		for (int i = 0; i < zoo.length; i++) {
			if (zoo[i].getAge() > 8) {
				System.out.println(zoo[i]);
			}
		}

		System.out.println("=====================ZOO (AVG age)========================");
		int suma = 0;
		for (int i = 0; i < zoo.length; i++) {
			suma += zoo[i].getAge();
		}

		System.out.printf("AVG age of animals => %10.3f years old!\n", suma / (float) zoo.length);
//		порівнянян обєктів
		Animal cat1 = new Animal("type1", "Murchik", 12, "gray");
		Animal cat2 = new Animal("type2", "Pushok", 10, "gray");
		Animal cat3=cat1;
		System.out.println(cat1==cat2); // false equal address (references) in memory  
		System.out.println(cat1==cat3); //true equal address (references) in memory 
		System.out.println(cat1.equals(cat2)); // false equal address (references) in memory without equals, hashCode 
		System.out.println(cat1.equals(cat3)); //true equal address (references) in memory without equals, hashCode
		
		Animal [] cats= {cat1, cat2, cat3};
		System.out.println(Arrays.toString(cats));
		//за зростанням age
		Arrays.sort(cats,(c1,c2)->c1.getAge()-c2.getAge());
		// сортування за алфавітом
		Arrays.sort(cats,(c1,c2)->c2.getName().compareToIgnoreCase(c1.getName()));
		System.out.println(Arrays.toString(cats));
		
		in.close();

	}

}
