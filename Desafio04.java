package DesafioEstruturas;

import java.util.Scanner;

public class Desafio04 {
	
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);

	int contador = 0;
	
	System.out.print("Digite o n�mero:");
	int num = sc.nextInt();
	
	for (int i = 2; i < num; i++) {
		if (num % i == 0) {
			contador++;
		}
	}
	
	if (contador == 0) {
	System.out.println("O n�mero " + num + " � primo.");
	} else {
		System.out.println("O n�mero " + num + " n�o � primo.");
	}
	

	sc.close();	
	
}
	
}
