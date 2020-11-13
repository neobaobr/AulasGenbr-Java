package ex5;

import java.util.Scanner;

public class main5 {

	public static void main(String[] args) {
		int idade, dias, meses, anos;

		Scanner scan = new Scanner(System.in);
		System.out.println("digite sua idade em anos , meses e dias ");
		System.out.println("digite sua idade em  , ANos \n");
		anos = scan.nextInt();
		System.out.println("digite sua idade em  meses \n ");
		meses = scan.nextInt();
		System.out.println("digite sua idade em  dias \n");
		dias = scan.nextInt();

		
		
		idade=365*anos+30*meses+dias;
		System.out.println("sua idade em dias eh "+idade);
	}

}
