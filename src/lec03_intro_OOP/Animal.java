package lec03_intro_OOP;

import java.util.Objects;

public class Animal {
	static int count=0;
//	public String type;
//	public String name;
//	public int age;
//	public String color;
	//принцип ООП => інкапсуляція
	private String type;
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
	public Animal(String type, String name, int age, String color) {
		this.type=type;
		this.name=name;
		this.age=age;
		this.color=color;
		Animal.count++;
	}
	
	//POJO =>Plain Old Java Object
	
	
	@Override
	public String toString() {
		return "Animal: type=" + type + ", name=" + name + ", age=" + age + ", color=" + color;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(age, color, name, type);
//	}

	@Override
	public boolean equals(Object obj) { // ==
//		if (this == obj) //reference
//			return true;
//		if (obj == null) 
//			return false;
//		if (getClass() != obj.getClass()) 
//			return false;
		Animal other = (Animal) obj;
//		return age == other.age && Objects.equals(color, other.color) && Objects.equals(name, other.name)
//				&& Objects.equals(type, other.type);
		
		if (this.name.equalsIgnoreCase(other.getName())) {
			if(this.age==other.getAge())
				return true;
		}
		return false;
	} 
	
	
	
}
