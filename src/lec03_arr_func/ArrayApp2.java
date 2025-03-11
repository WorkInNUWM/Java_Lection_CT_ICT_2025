package lec03_arr_func;

import java.util.Arrays;

public class ArrayApp2 {

	public static void main(String[] args) {
		int[] a;
		a = new int[4];
		a[0] = 2;
		a[1] = 4;
		a[2] = 7;
		a[3] = 9;
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "]=" + a[i] + ",");
		}
		// заповнення випадковими числами 
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 3 + 8);
		}
		System.out.println();
		// виведення даних
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "]=" + a[i] + ",");
		}
		System.out.println();
		// 2-arrays
		int[][] mas = new int[3][5];
		mas[0][0] = 3;
		int[][] mas1 = { { 2, 3, 4, 6, 7 }, { 6, 7, 10, 0, 6 }, { -4, 3, 25, 3, 0 } };
		print_masiv(mas1); // call function (method)

		int[][][] mas3 = new int[3][4][4];
		int[][][] mas31 = { // 2x2x3
					{ 
					  { 2, 3, 5 }, 
					  { 3, 4, 6 } 
					},
					{ 
				    	{ 5, 6, 6 },
						{ 7, 8, 9 }
					} 
				};
// заповнення масиву
		int[][] mas2 = new int[3][];
		mas2[0] = new int[2];// 0,1
		mas2[1] = new int[3]; // 0,1,2
		mas2[2] = new int[4];// 0,1,2,3
		System.out.println("Нерівномірний масив: ");
		for (int i = 0; i < mas2.length; i++) {
			for (int j = 0; j < mas2[i].length; j++) {
				mas2[i][j] = (int) (Math.random() * 2 + 9);
				System.out.print(mas2[i][j] + " ");
			}
			System.out.println();
		}
//
		// знайти суму елементів 2-вимірного масиву, які діляться націло на 5
		int S = 0;
		for (int i = 0; i < mas1.length; i++) {
			for (int j = 0; j < mas1[i].length; j++) {
				if (mas1[i][j] % 5 == 0) {
					S += mas1[i][j]; // S=S+mas1[i][j];
				}
			}
		}
		System.out.println("S=" + S);
		int[] mas4 = new int[3];
		int[] mas5 = mas4;
		mas4[0] = 4;
		mas4[1] = 3;
		mas4[2] = 5;
		System.out.println("Mas4: " + Arrays.toString(mas4));
		System.out.println("Mas5: " + Arrays.toString(mas5));
		mas5[2] = 25;
		System.out.println("Mas4: " + Arrays.toString(mas4));
		System.out.println("Mas5: " + Arrays.toString(mas5));
		int n = 3;
		int[] mas41 = new int[n];
		int[] mas51 = new int[2];
		mas41[0] = 3;
		mas41[1] = 4;
		mas41[2] = 5;
		for (int i = 0; i < mas51.length; i++) {
			mas51[i] = mas41[i];
		}
		System.out.println("Mas41: " + Arrays.toString(mas41));
		System.out.println("Mas51: " + Arrays.toString(mas51));
		mas51[1] = 25;
		System.out.println("Mas41: " + Arrays.toString(mas41));
		System.out.println("Mas51: " + Arrays.toString(mas51));
//
		mas51 = Arrays.copyOf(mas41, 2);
		System.out.println(Arrays.toString(mas51));

		int[][] mas7 = new int[3][4];

		input_masiv(mas7);
		print_masiv(mas7);

		int[][] mas8 = new int[5][4];

		input_masiv(mas8);
		print_masiv(mas8);
	}// end main
//declarade function (method)

	public static void print_masiv(int[][] mas1) {
		System.out.println("Masiv:");
		for (int i = 0; i < mas1.length; i++) {
			for (int j = 0; j < mas1[i].length; j++) {
				System.out.print(mas1[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void input_masiv(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = (int) (Math.random() * 2 + 9);
//				System.out.print(mas[i][j] + " ");
			}
//			System.out.println();
		}
	}

}
