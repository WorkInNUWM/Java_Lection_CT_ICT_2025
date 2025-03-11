package lec03_arr_func;

import java.util.Arrays;

public class Lab3App {

	public static void main(String[] args) {
		int [] a=new int[10];
		for(int i=0; i<a.length; i++) {
			a[i]=(int)(Math.random()*1000000);

		}
		System.out.println(Arrays.toString(a));
					
		int maxCountDigitElement=0;
		int maxCountDigit=0;
		for (int element : a) {
			int number=element; //123
			int sumaDigit=0;
			int countDigit=0;
			while (number>0){ 
				int ostacha=number%10; //1=> 3 ; 2=> 2 ;3 => 1 
				sumaDigit+=ostacha;
				countDigit++;
				number=number/10; // 1= > 12;   2=> 1;  3 => 0
			}
			System.out.println(element+" suma digitd => "+sumaDigit);
			if (countDigit>=maxCountDigit) {
				maxCountDigit=countDigit;
				maxCountDigitElement=element;
			}
		}
		System.out.println("maxCountDigit=>"+maxCountDigit+"; element=> "+maxCountDigitElement);
		
	}

}			
