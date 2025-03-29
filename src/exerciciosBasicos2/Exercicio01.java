//EXERCÍCIOS BASICOS 2
//01 Escreva um programa que leia um número inteiro do usuário e diga se ele é par ou ímpar.


package exerciciosBasicos2;

import java.util.Scanner;

public class Exercicio01 {
	
		public static void main (String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("DIGITE UM NUMERO INTEIRO!");
			int numero = scan.nextInt();
			
			if(numero % 2 == 0) {
				System.out.println("O numero é PAR!");
			}else { 
				System.out.println("O numero é ÍMPAR");
			scan.close();
		}

}
}
