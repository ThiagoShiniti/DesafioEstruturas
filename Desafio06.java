package DesafioEstruturas;

import java.util.Random;

import java.util.Scanner;

public class Desafio06 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//int numero é a variável onde o usuário vai armezar a escolha
		//int tentativas é onde será guardada a variável de número de tentativas
		//int numeroSorteado é a variável onde será guardado o numero sorteado
		//int continuar é o verificador se o usuário vai continuar
		//int restantes é a quantidade de tentativas.
		int numero;
		int tentativas;
		int numeroSorteado;
		int continuar;
		int restantes = 10;
		
		// faça a mensagem do jogo até o jogodor inserir 0 na variável continuar
		do {
			
			System.out.println("Sorteando um número aleatório entre 0-100 ...\n");
			
			// randomiza o número
			Random numeroAleatorio = new Random();
			
			numeroSorteado = numeroAleatorio.nextInt(101);
			// o número 101 é colocado pois o 0 também conta como um número se fosse colocado 100 ele não geraria até o número 100 e sim até o 99
			
			System.out.printf("Começou o jogo você consegue me vencer em %d tentativas?\n", restantes);
			
			// tentativas começa no 0
			tentativas = 0;
			
			
			// Soma uma tentativa toda vez que digitar um número diferente da escolhida
			do {
				
				tentativas ++;
				restantes--;
				
				System.out.printf("Tentativa %d: ",tentativas);
				
				numero = sc.nextInt();
				
				if (numeroSorteado > numero) {
					
					System.out.printf("O número sorteado é maior do que %d\n\n", numero);
					
				}else if (numeroSorteado < numero) {
					
					System.out.printf("O número sorteado é menor do que %d\n\n", numero);
					
				}else {
					
					System.out.printf("Você acertou o número sorteado em %d tentativas!\n\n", tentativas);
					
				}	
				
				
			} while (numero != numeroSorteado && restantes != 0); {
				
				if(restantes == 0) {
					System.out.println("Você perdeu!");
				}
				
				System.out.println("Digite 0 para sair ou qualquer outro número para continuar!");
				continuar = sc.nextInt();
				
				
			}
		} while (continuar != 0);
		
		System.out.println("FIM!");
			
							
	sc.close();
		
	}
}
