package lec02_if_else_switch_for_while;

public class AppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 6, b = 8, max;

		if (a > b)
			max = a;
		else
			max = b;
		
		System.out.println("max="+max);
		
		int min=(a<b)?a:b;
		System.out.println("min="+min);
		int day = 5;
		switch (day) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Working");
			break;
		case 6:
			System.out.println("Weekend");
			break;
		default:
			System.out.println("Error!!");
		}
		
		int count=1, number=10;
		while(count<=10) {
			System.out.println("count "+count);
			count++;
		}
		
		for(count=1; count<=number;count++) {
			if (count==4 || count==7) {
				continue;
			} 
			System.out.println("count "+count);
			
		}
		
		count=1;
		for( ;count<=number;) {
			System.out.println("count "+count);
			count++;
		}
		
		count=1;
		for(;;) {
			if ((count==4) || (count==7)) {
				count++;
				continue;
			} 
			System.out.println("count "+count);
			count++;
			if (count>number) {
				break;
			}
		}
		
	}

}
