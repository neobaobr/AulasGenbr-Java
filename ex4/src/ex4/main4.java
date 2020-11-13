package ex4;

import java.util.Scanner;

public class main4 {

	public static void main(String[] args) {
		int tempo, horas, minutos , segundos,total ;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("digite o tempo do evento em segundos");
		tempo = scan.nextInt();
		horas=tempo/3600;
		minutos= tempo-3600*horas;
		segundos= tempo-3600*horas-60*minutos; 
		
		System.out.println("tempo total = \n"+horas);
		System.out.println("minutos \n"+minutos);
		System.out.println("segundos \n"+segundos);
	}

}
