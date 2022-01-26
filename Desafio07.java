package DesafioEstruturas;

import java.util.Scanner;

// 7. Criar um programa que enquanto estiver recebendo números positivos,imprime no console a soma dos números 
// inseridos,caso receba um número negativo,encerre o programa.Tente utilizar a estrutura do while.

public class Desafio07 {

	public static void main(String[] args) {
		
		int numero = 0;
		int memoria = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("Adicione números e veja a sua soma ou digite 0 ou um valor negativo para sair:");
			numero = sc.nextInt();
			
			if (numero >= 0) {
				memoria += numero;
				System.out.printf("Sua soma atual é de %d\n\n", memoria);
			}
									
		} while(numero >= 0);
		System.out.println("FIM!");

		sc.close();   

	}

}
