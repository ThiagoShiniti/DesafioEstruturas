package DesafioEstruturas;

public class TesteDoWhile {
	public static void main(String[] args) {
		
		int tentativas = 10;
		int oi = 0;
		do {
			tentativas --;
			oi++;
			System.out.println("Oi " + tentativas + " " + oi);
			
		}while ( tentativas !=0 && oi < 20)
		
		System.out.println("Fim");
		
	}

}
