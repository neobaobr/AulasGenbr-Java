package ex6;

import java.util.Scanner;

public class main6 {

	public static void main(String[] args) {
		int dias , meses , anos ,dias2;
		Scanner scan = new Scanner(System.in);
		System.out.println("digite sua idade em dias \n");
		dias=scan.nextInt();
		anos=dias/365;
		meses=(dias-anos*365)/30;
		dias2=dias-anos*365-meses*30;
		System.out.println("sua idade em anos meses e dias eh \n");
		System.out.println("anos \n"+anos);
		System.out.println("meses \n"+meses);
		System.out.println("dias \n "+ dias2);
		
		
	}

}
