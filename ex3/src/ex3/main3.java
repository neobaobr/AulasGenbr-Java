package ex3;

import java.util.Scanner;

public class main3 {

	public static void main(String[] args) {
		int a, b, c, d, r, s;

		Scanner scan = new Scanner(System.in);

		System.out.println("digite os valores a , b ,c : \n");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();

		r = (a + b) * (a + b);
		s = (b + c) * (b + c);
		d = (r + s) / 2;
		System.out.println("os valores de r , s e d sao ,respectivamente \n ");
		System.out.println(r);
		System.out.println(s);
		System.out.println(d);

	}

}
