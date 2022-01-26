package DesafioEstruturas;

import java.util.Scanner;

public class Desafio05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int contador = 0;

		System.out.print("Digite o número: ");
		int num = sc.nextInt();

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				contador++;
			}
		}

		switch (contador) {
		case 0:
			System.out.println("O número " + num + " é primo.");
			break;
		default:
			System.out.println("O número " + num + " não é primo.");

			sc.close();	

		}

	}
}
