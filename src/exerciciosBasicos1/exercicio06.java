/*	06 Crie um programa que leia a quantidade de litros de água consumidos por uma residência em um mês e
  	escreva o valor da conta de água (considerando que cada litro de água custa R$0,02).*/

package exerciciosBasicos1;

import java.util.Scanner;

public class exercicio06 {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double consumo;
		double quantidade;
		double preçoPorLitro = 0.02;
		double valorDaConta;
	
		
		System.out.println("DIGITE O CONSUMO, EM M3, NO PERIODO:");
		consumo = scan.nextDouble();
		
		
		quantidade = consumo * 1000;
		valorDaConta = quantidade * preçoPorLitro;
		
		System.out.println("\nVISTO QUE A QUANTIDADE FOI DE: " + quantidade +"L");
		System.out.println("O VALOR DA CONTA É DE: " + valorDaConta + "R$");
		
				
	}
	

}

// PREÇO POR LITRO DEVE SER TROCADA VIRGOLA POR UM PONTO
