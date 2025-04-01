package lec04_Princeples_OOP_2;
/*
 *  Створити клас Robot i класи CoffeRobot, RobotDancer, RobotCoocker, які будуть нащадками Robot. Оголосити в Robot метод work(), в
якому слід описати роботу яку буде виконувати кожен з роботів (тобто, метод повинен наслідуватись):
• Для Robot, щоб на консоль виводився текст «Я Robot – я просто працюю».
• Для CoffeRobot, щоб на консоль виводився текст «Я CoffeRobot – я варю каву».
• Для RobotDancer, щоб на консоль виводився текст «Я RobotDancer – я просто танцюю».
• Для RobotCoocker, щоб на консоль виводився текст «Я RobotCoocker – я просто готую».
Створити в Main класі екземпляри вищеописаних класів і викликати до кожного з них метод work().
 * */
public class MainClass {
	public static void main(String[] args) {
		Robot robot1=new Robot();
		robot1.work();
		
		Robot robot2=new CoffeRobot("Я CoffeRobot – я варю каву");
		robot2.work();
//		
		CoffeRobot robot3=new CoffeRobot("Я CoffeRobot – я варю каву");
		robot3.work();
	
//		
		Object robot4=new CoffeRobot("Я CoffeRobot – я варю каву");
		CoffeRobot robot5=(CoffeRobot) robot4;
		robot5.work();
//		
		Robot robot6=new CoffeRobot("Я CoffeRobot – я варю каву");
		CoffeRobot robot7=(CoffeRobot) robot6;
		robot7.work();
//		
//		CoffeRobot robot8= (CoffeRobot) new Robot("Я CoffeRobot – я варю каву"); // Exception  ERROR!!!!
//		robot8.work();
		
		Robot robot9=new RobotDancer("I am RobotDancer and I am dancing", "Tango");
		robot9.work();
	
//		
//		RobotDancer robot10=new RobotDancer("I am RobotDancer and I am dancing", "Tango");
		RobotDancer robot10=new RobotDancer("Tango");
//		RobotDancer robot10=new RobotDancer();
		robot10.work();
		
		
//		robot10=(RobotDancer) robot6; //CoffeRobot != RobotDancer
//		System.out.println(robot10.getClass());
		
		RobotCooker robot11=new RobotCooker();
		robot11.work();
	}

}