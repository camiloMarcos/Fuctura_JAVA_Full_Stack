//04 Escreva um programa que leia a idade de uma pessoa e diga se ela pode votar ou não nas eleições. 
//
//No Brasil, o voto é obrigatório para pessoas entre 18 e 70 anos,
//
//e facultativo para pessoas entre 16 e 18 anos ou maiores de 70 anos.


package exerciciosBasicos2;
import java.util.Scanner;
		
		public class Exercicio04 {
			
			public static void main (String[] args) {
				
				Scanner scan = new Scanner(System.in);
				
				
				System.out.println("DIGITE A IDADE DO CIDADÃO");
				int idade = scan.nextInt();
				
				if (idade >= 18 && idade < 70) {
					System.out.println("Voto é OBRIGATÓRIO!");
				}else if (idade >= 16 && idade < 18 || idade > 70) {
					System.out.println("Voto é FACULTATIVO!");
				}else
					System.out.println("NÃO PODE VOTAR!");
				
				
								
				
			}
	
	
}
