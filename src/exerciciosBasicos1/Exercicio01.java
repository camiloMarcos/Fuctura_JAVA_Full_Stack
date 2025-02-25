/* Crie um programa que LEIA O NOME DO USUÁRIO E ESCREVA UMA SAUDAÇÃO personalizada: 
"Olá, [nome do usuário]! Bem-vindo ao nosso programa! "*/

package exerciciosBasicos1;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main (String[] args) {
		
			Scanner scan = new Scanner(System.in);
			
			System.out.println("DIGITE SEU NOME!");
			String nome = scan.nextLine();
			
			System.out.printf("\nOlá, %s ! Bem-vindo ao nosso programa!", nome);
	}

}
