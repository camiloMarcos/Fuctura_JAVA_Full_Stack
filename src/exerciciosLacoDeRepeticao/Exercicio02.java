/*	Exercicio 02 
 * 	Implemente um jogo em que o computador escolhe um número aleatório entre 1 e 100,
 * 	e o jogador tenta adivinhar.
 * O jogo continua até que o jogador acerte o número.
*/
package exerciciosLacoDeRepeticao;

import java.util.Random;
import java.util.Scanner;


public class Exercicio02 {
		
		public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int numSecreto = rand.nextInt(100) +1 ;
		int numJogador = 0;
		boolean venceu = false;
		
		System.out.println("""
				DIGITE SEU PALPITE ENTRE (0-100)
				E TENTE ADVINHAR O NÚMERO SECRETO!!
				""");
		numJogador = scan.nextInt();
		
		
		while(numJogador != numSecreto) {
			venceu = false;
						
				if (numJogador > numSecreto) {
					System.out.println("Muito alto, tente um número MENOR!");
					numJogador = scan.nextInt();
				}else {
					System.out.println("Muito Baixo, tente um número MAIOR!");
					numJogador = scan.nextInt();
				}
					
		}
				System.out.println("PARABÉNS, VOCÊ ACERTOU O NÚMERO SECRETO!");
				System.out.println("Número Secreto - "+ numSecreto);
				System.out.println("você escolheu - "+ numJogador);
	}

}
