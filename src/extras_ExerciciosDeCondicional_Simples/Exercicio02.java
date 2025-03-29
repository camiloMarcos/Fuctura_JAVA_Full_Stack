//	Peça ao usuário um número e informe se ele é par ou ímpar.


package extras_ExerciciosDeCondicional_Simples;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("INFORME UM NÚMERO");
		int numero = scan.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("O NÚMERO " + numero + " É PAR!");
		}else {
			System.out.println("O NÚMERO " + numero + " É ÍMPAR!");
		}
			

	}

}
