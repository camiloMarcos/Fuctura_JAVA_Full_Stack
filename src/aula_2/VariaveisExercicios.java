package aula_2;

import java.util.Scanner;

public class VariaveisExercicios {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("DIGITE SEU NOME!");
		String nome = scan.nextLine();
		
		System.out.println("DIGITE SUA IDADE!");
		int idade = scan.nextInt();
		
		System.out.println("DIGITE SUA ALTURA!");
		double altura = scan.nextDouble();
		
		
		
		//System.out.println("SEGUE OS DADOS DO DEV. JR. \n");
		//System.out.println("NOME: " + nome);
		//System.out.println("IDADE: " + idade + " anos.");
		//System.out.println("ALTURA É DE: " + altura);
		
		System.out.printf("SEGUE OS DADOS DO DEV. JR.\n\n");
		System.out.printf(" NOME: %s. \n IDADE: %d. \n ALTURA É DE: %f.", nome, idade, altura);
		
	}

}
