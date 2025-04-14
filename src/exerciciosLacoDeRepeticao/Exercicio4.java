//04 Peça ao usuário para inserir um número e imprima a tabuada desse número de 1 a 10.



package exerciciosLacoDeRepeticao;

import java.util.Scanner;

		public class Exercicio4 {
			
				public static void main(String[] args) {
					
				Scanner scan = new Scanner(System.in);
				
				
				System.out.println("DIGITE UM NUMERO INTEIRO!");
				int numero = scan.nextInt();
				
				int contador= 0;
				int tabuada=0;
					
				System.out.println("A Tabuada do número " + numero + " é");
				
				while (contador <= 10) {
					tabuada = numero * contador;
					System.out.println(tabuada);
					contador++;
				}
				scan.close();
			}
		
		}
