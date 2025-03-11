package Intro_Java;
import java.lang.Math;
import java.util.Scanner;


public class AppTest {
	static int k=6;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a1=345l;
		int a=4; //static init
		int b=4*a; //dynamic init
//		byte c=(byte) 128;
		short c=32767,c1=0;
		float d=34.5f;
		double  m=34.5;
		System.out.println(a*b);
		System.out.println(c1);
		System.out.println("c= "+c);
		c+=2;
		System.out.println(c);
		System.out.println("hello");
		System.out.print(5+"hello\n");
		System.out.println(Math.sin(30));
		System.out.println("Byte: min="+Byte.MIN_VALUE+", max="+Byte.MAX_VALUE);
		System.out.println("Short: min="+Short.MIN_VALUE+", max="+Short.MAX_VALUE);
		System.out.println("Integer: min="+Integer.MIN_VALUE+", max="+Integer.MAX_VALUE);
		System.out.println("Long: min="+Long.MIN_VALUE+", max="+Long.MAX_VALUE);
		System.out.println("Float: min="+Float.MIN_VALUE+", max="+Float.MAX_VALUE);
		System.out.println("Double: min="+Double.MIN_VALUE+", max="+Double.MAX_VALUE);
		System.out.println(15/4.0);
		
		Scanner input=new Scanner(System.in);
		System.out.println("Input n1=");
		int number1=input.nextInt();
		System.out.println("Input n2=");
		int number2=input.nextInt();
		System.out.println(number1/(float)number2);
		Float f1=new Float(3.4);
		System.out.println("f1="+f1);
		float f2=f1.floatValue();
		System.out.println("f2="+f2);
		System.out.println(f1==f2);
		
		int i= 128; // 
		Integer a3= i; // створення об’єкта+упакування
		Integer b3 = i;
		System.out.println(i);
		System.out.println(a3);
		System.out.println("a3==i " + (a3 == i)); // true – розпакування і порівняння значень
		System.out.println("b3==i " + (b3 == i)); // true
		System.out.println("a3==b3 " + (a3 == b3)); /* false (посилання на різні об’єкти )*/
		{
			int k=6;
			int t=7;
			System.out.println(k+t);
		}
		int k=3;
		int t=5;
		System.out.println(k+t);
		System.out.println("main:  k="+k);
		System.out.println("class:  k="+AppTest.k);
		System.out.println("Integer: min="+Integer.MIN_VALUE+", max="+Integer.MAX_VALUE+", size="+Integer.SIZE);
		input.close();
	}

}
