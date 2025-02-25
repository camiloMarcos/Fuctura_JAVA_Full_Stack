/*	04 Crie um programa que leia o número de horas trabalhadas por um funcionário e o valor da hora de trabalho e 
 	escreva o salário bruto desse funcionário.*/

package exerciciosBasicos1;

import java.util.Scanner;

public class exercicio04 {
	
		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			
			double quantidaDeHora;
			double valorDaHora;
			double salarioBruto;
			
			System.out.println("DIGITE A QUANTIDADE DE HORAS TRABALHADAS PELO FUNCIONÁRIO:");
			double quantidadeDeHora = scan.nextDouble();
			
			System.out.println("DIGITE O VALOR DA HORA DE TRABALHO:");
			valorDaHora = scan.nextDouble();
			
			salarioBruto = quantidadeDeHora * valorDaHora;
			
			
			System.out.println("\nO SALÁRIO BRUTO DO FUNCIONÁRIO É: " + salarioBruto + " R$." );
			System.out.printf("O SALÁRIO BRUTO DO FUNCIONÁRIO É: %.2f", salarioBruto);

		}

}
