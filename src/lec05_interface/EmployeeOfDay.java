package lec05_interface;

public class EmployeeOfDay implements ISalary{
	private int countDays;
	
	public EmployeeOfDay(int countDays) {
		super();
		this.countDays = countDays;
	}

	@Override
	public double salary() {
			return this.countDays*3100;
	}

}
