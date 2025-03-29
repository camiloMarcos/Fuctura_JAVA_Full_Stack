// EXERCÍCIOS BASICOS 2
// 02 Escreva um programa que leia dois números inteiros do usuário e diga qual é o maior, o menor ou se são iguais.


package exerciciosBasicos2;

import java.util.Scanner;


	public class Exercicio02 {
		
		public static void main (String[] args) {
			Scanner scan = new Scanner(System.in);
			
				System.out.println("DIGITE O PRIMEIRO NÚMERO!");
				int numeroA = scan.nextInt();
			
				System.out.println("DIGITE O SEGUNDO NÚMERO!");
				int numeroB = scan.nextInt();
			
				
				if (numeroA > numeroB) {
					System.out.printf("O numero: %d É MAIOR que %d", numeroA, numeroB);
				}else if (numeroA < numeroB) {
					System.out.printf("O numero: %d É MENOR que %d", numeroA, numeroB);
				}else {
					System.out.printf("Os numeros SÃO IGUAIS!");
				}
			
		}
	

}
