package lec06_Enum;

import java.time.Month;
import java.util.Scanner;

/*
 * 1) Написати консольну програму для роботи з Enums.
Створити енум Сезони, в якому оголосити такі константи : Зима , Весна, Літо, Осінь.
Створити енум Місяці, в якому створити 12 констант- місяці року(Січень , Лютий.. Грудень ), 
оголосити змінну дні, та змінну season типу Seasons , як поле енума.
Створити конструктор з визначеними параметрами в енумі Місяці, в який як параметри передати змінну дні та сезон. Описати getters до даних полів (дні, сезони). Створити консольне меню, в якому реалізувати наступні пункти :
• Перевірити чи є такий місяць (місяць вводимо з консолі, передбачити, щоб регістр
букв був не важливим )
• Вивести всі місяці з такою ж порою року
• Вивести всі місяці які мають таку саму кількість днів
• Вивести на екран всі місяці які мають меншу кількість днів
• Вивести на екран всі місяці які мають більшу кількість днів
• Вивести на екран наступну пору року
• Вивести на екран попередню пору року
• Вивести на екран всі місяці які мають парну кількість днів
• Вивести на екран всі місяці які мають непарну кількість днів
• Вивести на екран чи введений з консолі місяць має парну кількість днів

 * */
public class Application_Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Months monthTest=Months.APRIL;
		System.out.println(monthTest);
		Months [] masMonths=Months.values();
		Seasons[] masSeasons = Seasons.values();
		boolean flagNotExit=true;
		while(flagNotExit) {
			menu();
			String data=sc.next();
			switch(data) {
				case "1":{
					System.out.println("Input month:");
					String month=sc.next().toUpperCase();
					Months test=Months.valueOf(month);
					System.out.println("Ordinal=> "+test.ordinal());
					boolean isExsit=false;
					for (Months elem_month : masMonths) {
						System.out.println(elem_month==test);
						System.out.println(" equal object "+elem_month.equals(test));
						if(elem_month.name().equals(month)) {
							isExsit=true;
						}
					}
					if (isExsit) {
						System.out.println("There is such a month");
					}
					else {
						System.out.println("There is not such a month");
					}
					break;			
				}
				case "3":{
					System.out.println("Input number of days:");
					int day=sc.nextInt();
					boolean isExsit=false;
					for(Months m: masMonths) {
//						m.getDays() => Months.JENUERY.getdays() and ...
						if(m.getDays()==day) {
							System.out.println(m);
							isExsit=true;
						}
					}
					if(!isExsit) {
						System.out.println("months is not exists with number of "+day+" days!");
					}
					break;
				}
				case "4":{
					flagNotExit=false;
				}
			}
			
			
		}
}
	
static void menu() {
	
	String textMenu="Menu:\n" + "1. Перевірити чи є такий місяць \n"
			+ "2. Вивести всі місяці з такою ж порою року\n"
			+ "3. Вивести всі місяці, які мають таку саму кількість днів\n"
			+ "4. EXIT!";
	System.out.println(textMenu);
	
	}
}
