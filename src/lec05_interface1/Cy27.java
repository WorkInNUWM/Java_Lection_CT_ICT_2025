package lec05_interface1;

public class Cy27 extends Plane implements CapabilitiesOfPlane, IMovePlane{
	private int maxSpeed;
	private String colorPlane;
//	делегування
	private ControlPlane controlplane = new ControlPlane();

	public Cy27(double length, double width, double weight, int maxSpeed, String colorPlane) {
		super(length, width, weight);
		this.maxSpeed = maxSpeed;
		this.colorPlane = colorPlane;
	}
	
	@Override
	public void moveUp() {
		System.out.println("Plane is moving UP on: " + controlplane.moveUp() + " km");
	}

	@Override
	public void moveDown() {
		System.out.println("Plane is moving DOWN on: " + controlplane.moveDown() + " km");
	}

	@Override
	public void moveLeft() {
		System.out.println("Plane is moving LEFT on: " + controlplane.moveLeft() + " km");
	}

	@Override
	public void moveRigth() {
		System.out.println("Plane is moving RIGTH on: " + controlplane.movieRigth() + " km");
	}

	@Override
	public void TurboAcceleration() {
		System.out.println("MaxSpeed "+maxSpeed+" increased after use TurboAcceleration and equals "+(int)(Math.random() * 100 + maxSpeed));		
	}
	@Override
	public void StealthTechnology() {
		System.out.println("Plane is not visiable for "+(int)(Math.random() *100)+" minutes");
	}
	@Override
	public void NuclearStrike() {
		System.out.println((int)(Math.random()*10)+" nuclear warheads was to dump");
	}




	
}
