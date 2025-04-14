//	Jogo de Adivinhação
//	Escreva um programa que gera um número aleatório entre 1 e 100.
//	O usuário deve tentar adivinhar o número. O programa deve fornecer dicas:
//
//	"Muito alto" se o chute for maior que o número
//
//	"Muito baixo" se for menor
//
//	"Parabéns!" se acertar
//
//	O jogo deve continuar até o usuário acertar.


package extras_ExerciciosDeCondicional_Intermediario;

import java.util.Random;
import java.util.Scanner;

	public class ExercicioCondicional_Intermediario01 {
		
		public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		int numeroAleatorio = random.nextInt(100)+1;
		int tentativa;
		int maxTentativas = 7;
		boolean acertou = false;
		
		
		System.out.println("""
				Bem Vindo Ao Jogo De Advinhação!!!\n
				""");
		
		System.out.println("""
				\nTente advinhar um número inteiro entre (0-100),
				Você tem 7 tentativas.
				""");
		
		
				
		for(int i=1; i <= maxTentativas; i++) {
			
			int palpite = scan.nextInt();
						
				if (palpite == numeroAleatorio) {
					System.out.println("PARABÉNS, VOCÊ ACERTOU O NÚMERO SECRETO "+ numeroAleatorio);
					acertou = true;
					break;
					
				}else if (palpite > numeroAleatorio) {
					System.out.println("Muito Alto, tente um número MENOR!");
					
					System.out.println("Tentativa " + i);
					
				}else {
					System.out.println("Muito Baixo, tente um número MAIOR!");
				
					System.out.println("Tentativa " + i);
				}
				
				if(!acertou) {
					System.out.println("Suas Tentativas excederam o quantitativo permitido");
				}
				
			}
				
			}	
				
		}