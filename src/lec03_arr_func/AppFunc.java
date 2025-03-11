package lec03_arr_func;

import java.util.Arrays;

public class AppFunc {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hello();
		hello();
		hello("Olga");
		hello("Igor");
		hello("Oleg",20); //фактичні параметри
		int a=5,b=6;
		System.out.println("a="+a+" b="+b);
		int sum=suma(a,b);
		System.out.println("a="+a+" b="+b+" sum="+sum );
		System.out.println(" sum="+suma(3.4f,5.7f));
		System.out.println("=====Working spread operators:=====");
		;
		System.out.println("sum="+suma(1,2,3,4,5));
		System.out.println("sum="+suma(1.1f,2.2f,3.3f,4.4f,5.5f));
		System.out.println("sum="+suma("Good func:", 1.1f,2.2f,3.3f,4.4f,5.5f,6.6f,44.5f));
		System.out.println("fact(4)="+factorial(4));
	}
	
	//без параметрів
	static void hello() {
		System.out.println("Hello");
	}
	
	//з параметром => перевантаження функції
	static void hello(String name) {
		System.out.println("Hello, "+name);
	}
	
	static void hello(String name, int age) { //формальні параметри
		System.out.println("Hello, "+name+"! You have "+age+" years old.");
	}

	//функції, що повертають результат
	static int suma(int a, int b) { //передаються дані за значенням => копії фактичних апарметрів
		a++; 
		b++;
		System.out.println("In func suma: a="+a+" b="+b);
		int sum=a+b;
		return sum;
	}
	static float suma(float a, float b) { //передаються дані за значенням => копії фактичних апарметрів
		System.out.println("In func suma: a="+a+" b="+b);
		float sum=a+b;
		return sum;
	}
	
	//функція із параметрами змінної довжини+перевантаження
	static int suma(int ...numbers) { //передаються дані за значенням => копії фактичних апарметрів
		System.out.println(numbers);
		System.out.println(Arrays.toString(numbers));
//		for (int i = 0; i < numbers.length; i++) {
//			int j = numbers[i];
//			System.out.println(j);
//		}
		int sum=0;
		for (int item : numbers) {
			sum+=item;
		}
		return sum;
	}
	static float suma(float ...numbers) { //передаються дані за значенням => копії фактичних апарметрів
		float sum=0;
		for (float item : numbers) {
			sum+=item;
		}
		return sum;
	}
	
	static float suma(String message, float ...numbers) { //передаються дані за значенням => копії фактичних апарметрів
		System.out.println(message);
		float sum=0;
		for (float item : numbers) {
			sum+=item;
		}
		
		return sum;
	}
	//4!=1*2*3*4  => 4*3*2*1 
	/*
	   int n=4
	   int fact=1
	   for (int i = 0; i < n; i++) {
			fact*=i
		}
	  System.out.println(fact);
	   int fact=n
	   for (int i = n; i >=1 ; i--) {
			fact*=i
		}
	  System.out.println(fact);
	 * */
	//4*3*2!
	// factorial(4)=> 4*factorial(3)=> 4*(3*factorial(2))=>4*(3*(2*(factorial(1))))
	//      4*6                3*2*1               2 *1                 1   <=
	static int factorial(int n) {
		System.out.println(n);
		if (n==1)
			return 1;
		return n*factorial(n-1);
	}
}
