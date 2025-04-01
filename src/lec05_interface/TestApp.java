package lec05_interface;

public class TestApp {
	/*
	 *1. Створити interface Зарплата (ISalary), в якому передбачити метод зарплата(). 
	 *Створити клас Працівник з погодинною зарплатою (наприклад за контрактом), 
	 *та Працівник з фіксованою місячною зарплатою (наприклад, є в штаті і працює на постіній основі).
 		Реалізувати методи інтерфейсу в класах: 
 		1) Працівник з погодинною зарплатою, та
		2) Працівник з фіксованою місячною зарплатою. 
		Формула розрахунку зарплати працівника є довільною. Вивести на екран скільки
		заробляють перший і другий працівники.
	 */
	public static void main(String[] args) {
		EmployeeOfHour employee1=new EmployeeOfHour(180);
		EmployeeOfDay employee2= new EmployeeOfDay(18);
		System.out.println("Salary of employee1="+employee1.salary());
		System.out.println("Salary of employee2="+employee2.salary());
		
	}
}
