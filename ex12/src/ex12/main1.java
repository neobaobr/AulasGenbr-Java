package ex12;

import java.util.Scanner;

public class main1 {

	public static void main(String[] args) {
		double m1, m2, m3, media, p1 = 0.1, p2 = 0.2, p3 = 0.3;
		Scanner scanner = new Scanner(System.in);

		System.out.println("digite as notas : m1 m2 e m3 \n");
		System.out.println("digite as notas : m1 \n");
		m1 = scanner.nextDouble();

		System.out.println("digite as notas : m2 \n");
		m2 = scanner.nextDouble();
		System.out.println("digite as notas : m3 \n");
		m3 = scanner.nextDouble();

		media = (m1 * p1 + m2 * p2 + m3 * p3) / (p1 + p2 + p3);
		System.out.println("a media eh \n ");

		System.out.println(media);

	}

}
