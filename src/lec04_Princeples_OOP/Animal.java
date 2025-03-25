package lec04_Princeples_OOP;

import java.util.Objects;

public class Animal {
	static int count=0;
	//принцип ООП => інкапсуляція
	protected String type;
	private String name;
	private int age;
	private String color;
	
	//конструктор без параметрів
	public Animal() {
		this.age=1;
		this.name="NoName";
		Animal.count++;
	}
	
	//кастомні конструктори
	public Animal(String type, String name, int age) {
		this.type=type;
		this.name=name;
		this.age=age;
		Animal.count++;
	}
	
	//POJO =>Plain Old Java Object
	
	
	@Override
	public String toString() {
		return "Animal: type=" + type + ", name=" + name + ", age=" + age ;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age>0)	
			this.age = age;
		else {
			System.out.println("Не коректні дані!");
		}
	}

	public void eat() {
		System.out.println(this.name+" eat all!");
	}
	
	public void  voice() {
		System.out.println("Nothing");
	}
}
