package lec03_arr_func;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner in=new Scanner(System.in);
		int N=10;
//		int [] a=new int[N];
//		for (int i = 0; i < a.length; i++) {
//			System.out.print("a["+i+"]=");
//			a[i]=in.nextInt();
//		}
		
		
//		System.out.println(a);
//		System.out.println(Arrays.toString(a));
//		System.out.print("[");
//		for (int element : a) {
//			System.out.print(element+", ");
//		}
//		System.out.println("]");
//		
//		System.out.print("[");
//		for (int i =0; i<a.length; i++) {
//			if (i<a.length-1)
//				System.out.print(a[i]+", ");
//			else
//				System.out.print(a[i]);
//		}
//		System.out.print("]");
//		
//		in.close();
		int b[]= {45,56,67,34,87,42,35,84};
		int c[]=new int[10];
		System.out.println(b);
		System.out.println(Arrays.toString(b));
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
		Arrays.fill(c, 45);
		System.out.println(Arrays.toString(c));
		printArr(b);
		System.out.println(Arrays.toString(b));
		sumaPrint(34,45);
		System.out.println("Suma="+suma(54,66));
		
	}
	
	static void printArr(int[]mas) {
		System.out.print("Custom => [");
		for (int i =0; i<mas.length; i++) {
			if (i<mas.length-1)
				System.out.print(mas[i]+", ");
			else
				System.out.print(mas[i]);
		}
		System.out.print("]");
		mas[0]=3434;
	}
	
	static void sumaPrint(int a, int b) {
		System.out.println(a+"+"+b+"="+a+b);
	}
	
	static int suma(int a, int b) {
		return a+b;
	}

}
