package DesafioEstruturas;

import java.util.Random;

import java.util.Scanner;

public class Desafio06 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//int numero � a vari�vel onde o usu�rio vai armezar a escolha
		//int tentativas � onde ser� guardada a vari�vel de n�mero de tentativas
		//int numeroSorteado � a vari�vel onde ser� guardado o numero sorteado
		//int continuar � o verificador se o usu�rio vai continuar
		//int restantes � a quantidade de tentativas.
		int numero;
		int tentativas;
		int numeroSorteado;
		int continuar;
		int restantes = 10;
		
		// fa�a a mensagem do jogo at� o jogodor inserir 0 na vari�vel continuar
		do {
			
			System.out.println("Sorteando um n�mero aleat�rio entre 0-100 ...\n");
			
			// randomiza o n�mero
			Random numeroAleatorio = new Random();
			
			numeroSorteado = numeroAleatorio.nextInt(101);
			// o n�mero 101 � colocado pois o 0 tamb�m conta como um n�mero se fosse colocado 100 ele n�o geraria at� o n�mero 100 e sim at� o 99
			
			System.out.printf("Come�ou o jogo voc� consegue me vencer em %d tentativas?\n", restantes);
			
			// tentativas come�a no 0
			tentativas = 0;
			
			
			// Soma uma tentativa toda vez que digitar um n�mero diferente da escolhida
			do {
				
				tentativas ++;
				restantes--;
				
				System.out.printf("Tentativa %d: ",tentativas);
				
				numero = sc.nextInt();
				
				if (numeroSorteado > numero) {
					
					System.out.printf("O n�mero sorteado � maior do que %d\n\n", numero);
					
				}else if (numeroSorteado < numero) {
					
					System.out.printf("O n�mero sorteado � menor do que %d\n\n", numero);
					
				}else {
					
					System.out.printf("Voc� acertou o n�mero sorteado em %d tentativas!\n\n", tentativas);
					
				}	
				
				
			} while (numero != numeroSorteado && restantes != 0); {
				
				if(restantes == 0) {
					System.out.println("Voc� perdeu!");
				}
				
				System.out.println("Digite 0 para sair ou qualquer outro n�mero para continuar!");
				continuar = sc.nextInt();
				
				
			}
		} while (continuar != 0);
		
		System.out.println("FIM!");
			
							
	sc.close();
		
	}
}
