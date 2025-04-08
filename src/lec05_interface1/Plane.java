package lec05_interface1;

public abstract class Plane {
	private double length;
	private double width;
	private double weight;

	public Plane(double length, double width, double weight) {
		this.length = length;
		this.width = width;
		this.weight = weight;
	}

//	abstract public void moveUp();
//
//	abstract public void moveDown();
//
//	abstract public void moveLeft();
//
//	abstract public void moveRigth();

	void startingTheEngine() {// ������ �������
		System.out.println("The plane was choking before the " + (int) (Math.random() * (88 - 19) + 19) + "minutes");
	}

	void takeOffPlane() {// ���� �����
		System.out.println("The plane will pass " + (int) (Math.random() * 1000) + "km");
	}

	void landingOfThePlane() {// ������� �����
		System.out.println("Plane plane is landing");
	}

}
