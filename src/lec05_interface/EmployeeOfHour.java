package lec05_interface;

public class EmployeeOfHour implements ISalary{
	private int countHours;
	public EmployeeOfHour(int countHours) {
		this.countHours=countHours;
	}
	@Override
	public double salary() {
		// TODO Auto-generated method stub
		return this.countHours*900;
	}



}
