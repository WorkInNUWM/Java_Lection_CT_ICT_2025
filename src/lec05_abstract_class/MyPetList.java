package lec05_abstract_class;

import java.util.Arrays;

public class MyPetList {
	private Pet[] pets;
	private int nextIndex = 0;

	public MyPetList() {
		pets = new Pet[4];
	}

	public MyPetList(int size) {
		pets = new Pet[size];
	}
	
	public void add(Pet pet) {
		if (this.nextIndex < this.pets.length) {
			pets[this.nextIndex] = pet;
			System.out.println("Pet add to cell " + this.nextIndex);
			this.nextIndex++;
		}
	}

	public void infoPets() {
		for (Pet pet : pets) {
			if (pet != null) {
				pet.eat();
				pet.voice();
//				System.out.println(pet);
			}
		}
	}

	@Override
	public String toString() {
		return "MyPetList [pets=" + Arrays.toString(pets) + ", nextIndex=" + nextIndex + "]";
	}

}
