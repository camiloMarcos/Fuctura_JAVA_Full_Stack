//	Escreva um programa que peça um número ao usuário e exiba se ele é positivo, negativo ou zero.

package extras_ExerciciosDeCondicional_Simples;

public class Exercicio01 {
		
		public static void main (String[] args) {
		var scan = new java.util.Scanner(System.in);
		
		System.out.println("DIGITE UM NÚMERO E VERIFIQUE SE É POSITIVO OU NEGATIVO ");
		int numero = scan.nextInt();
		
		if ( numero > 0) {
			System.out.println("O NÚMERO " + numero  + " É POSITIVO!");
		}else if (numero < 0) {
			System.out.println("O NÚMERO " + numero + " É NEGATIVO!");
		}else {
			System.out.println("O NÚMERO " + numero + " É NEUTRO!");
		}
		scan.close();
	}

}
