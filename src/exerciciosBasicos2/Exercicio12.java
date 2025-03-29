//12 Escreva um programa que leia um número inteiro entre 1 e 7 e mostre o dia da semana correspondente.
//Se o número não estiver nesse intervalo, mostre uma mensagem de erro.

package exerciciosBasicos2;
import java.util.Scanner;


public class Exercicio12 {
		
		public static void main(String [] args) {
			
				Scanner scan = new Scanner(System.in);
				
				System.out.println("DIGITE UM NÚMERO ENTRE 1 - 7, CORRESPONDENTE AOS DIAS DA SEMANA!");
				int dia = scan.nextInt();
				
				
				switch (dia) {
				case 1:
					System.out.println("Domingo");
					break;
				case 2:
					System.out.println("Segunda");
					break;
				case 3:
					System.out.println("Terça");
					break;
				case 4:
					System.out.println("Quarta feira");
					break;
				case 5:
					System.out.println("Quinta feira");
					break;
				case 6:
					System.out.println("Sexta-feira");
					break;
				case 7:
					System.out.println("Sábado");
					break;
				default:
					System.out.println("Opção Inválida");
					break;
				}
			scan.close();
		}
		

}
