package java01.basic.ex03;

import java.util.Scanner;

@SuppressWarnings("resource")
public class Ex05 {
	public static void q1() {
		System.out.println("1��, �� �� �Է�  ");
		Scanner in = new Scanner(System.in);
		int b, c, max;

		max = in.nextInt();
		b = in.nextInt();
		max = max > b ? max : b;
		c = in.nextInt();
		max = max > c ? max : c;

		System.out.println("max : " + max);	
		System.out.println();
	}

	public static void q2() {
		System.out.println("���� �Ǻ�");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		String check = "���";
		int ret = num;

		if(num < 0) 
		{check = "����"; ret *= -1;}

		System.out.println("�Ǻ��� �� : " + num);
		System.out.println(check + " : " + ret);
		System.out.println();
	}

	public static void q3() {
		System.out.println("�¾ �⵵ 2�ڸ� �Է� ");
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		int defaultYear = 121;

		if(year < 21) defaultYear = 21;

		System.out.println(year + "�� �¾ ����� " + (defaultYear - year) + "�� �Դϴ�");
		System.out.println();
	}

	public static void q4() {

		Scanner in = new Scanner(System.in);
		int num = in.nextInt();

		switch(num/10) {
		case 9:	System.out.println("A");
		break;
		case 8:System.out.println("B");
		break;

		case 7:System.out.println("C");
		break;

		default: System.out.println("F");

		}

		if(num%10 > 5 && num > 60)System.out.println("+");
	}

	public static void q5() {

		int rand[] = new int[10];
		int max = 2<<9;

		for (int i = 0; i < 10; i++) {
			rand[i] = (int)(Math.random() * 100) +1;
			max = max > rand[i] ? max : rand[i];

			System.out.print(rand[i] + " ");
		}
		System.out.println();
		System.out.println("max : " + max);
		//Collections.sort(rand);
	}

	public static void q6() {
		/*
			3�� 50�� = 230sec
			������������ ��
		 */

		Scanner in = new Scanner(System.in);
		final int SONGLEN = 230;
		int num = in.nextInt();
		int percent = (int) (((double)num / SONGLEN) * 100);
		
		
		System.out.println("just test 10 options");
		for(int j = 1 ; j <= 10 ; ++j) {

			percent = j * 10;
			
			System.out.print("��");
			for(int i = 0 ; i < 10 ; ++i) System.out.print("��");
			System.out.println("��");
			System.out.print("��");

			for(int i = 0 ; i < percent / 10 - 1 ; ++i)
				System.out.print("��");
			System.out.print(percent + "%");


			if(percent/10 < 8) {
				for(int k = 1 ; k < 9 - percent/10 ; ++k)
					System.out.print(" ");
				System.out.println("��");
			}
			else System.out.println();
			System.out.print("��");
			for(int i = 0 ; i < 10 ; ++i) System.out.print("��");
			System.out.println("��");
			System.out.println();
		}
	}

	public static void main(String[] args) {

		//		q1();
		//		q2();
		//		q3();
		//		q4();
		//		q5();
		q6();


	}
}