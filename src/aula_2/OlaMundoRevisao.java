package aula_2;

import java.util.Scanner;

public class OlaMundoRevisao {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("DIGITE SEU NOME!");
		String nome = scan.nextLine();
		
		System.out.println("Alo Mundo Java!!!\n");
		System.out.println("Bem Vindo, " + nome);
		
	}

}
