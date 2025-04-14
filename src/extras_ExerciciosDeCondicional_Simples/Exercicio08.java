//	08 Comparação de duas palavras:
//	Peça duas palavras ao usuário e verifique se são iguais, IGNORANDO LETRAS MAIÚSCULAS E MINÚSCULAS.


package extras_ExerciciosDeCondicional_Simples;

import java.util.Scanner;


public class Exercicio08 {
	
		public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("DIGITE O PRIMEIRO NOME!");
		String nomePri = scan.nextLine();
		System.out.println("DIGITE O SEGUNDO NOME!");
		String nomeseg = scan.nextLine();
		
		if(nomePri.equalsIgnoreCase(nomeseg)) {
			System.out.printf("O nome %s e p nome %s, SÃO IGUAIS", nomePri, nomeseg);
			
		}else {
			System.out.println("Os nomes SÃO DIFERENTES");
		}
		
		}

}
