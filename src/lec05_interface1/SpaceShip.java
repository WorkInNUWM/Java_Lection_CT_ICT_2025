package lec05_interface1;

public class SpaceShip implements IMovePlane, CapabilitiesOfPlane {
	private String nameShape;
	private ControlPlane spaceControlPlane=new ControlPlane();
	public SpaceShip(String nameShape) {
		this.nameShape = nameShape;
	}
	@Override
	public void moveUp() {
		System.out.println("Space is moving UP on: " + spaceControlPlane.moveUp() + " km");
		
	}
	@Override
	public void moveDown() {
		System.out.println("Space is moving DOWN on: " + spaceControlPlane.moveDown() + " km");
	}
	
	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void moveRigth() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void TurboAcceleration() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void StealthTechnology() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void NuclearStrike() {
		// TODO Auto-generated method stub
		
	}
		
	

}
