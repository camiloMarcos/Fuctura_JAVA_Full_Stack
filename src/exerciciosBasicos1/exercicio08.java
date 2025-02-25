/*	08 Crie um programa que leia a cotação do dólar e um valor em reais e 
	escreva o valor convertido em dólares.*/

package exerciciosBasicos1;

import java.util.Scanner;

public class exercicio08 {
	
	public static void main (String[]args) {
		
			Scanner scan = new Scanner(System.in);
			
			double cotacao;
			double valorEmReais;
			double valorDoReal;
			double valorConvertido;
			
			
			System.out.println("DIGITE A COTAÇÃO DO DÓLAR:");
			cotacao = scan.nextDouble();
			
			System.out.println("DIGITE O VALOR EM REAIS PARA CONVERSÃO: ");
			valorEmReais = scan.nextDouble();
			
						
			valorDoReal = 1/cotacao;
						
			valorConvertido = valorEmReais * valorDoReal;
			
			System.out.printf("O VALOR DE: %.2f REAIS,", valorEmReais);
			System.out.println("\nO VALOR EM DÓLARES: $" + valorConvertido);
		
		
	}

}
// dificuldade sempre é de fórmula matemática de fato
