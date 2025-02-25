/* 10 Crie um programa que leia o preço à vista de um produto e o número de parcelas e
 * escreva  o valor de cada parcela (considerando juros simples de 2% ao mês).*/
package exerciciosBasicos1;

import java.util.Scanner;

public class exercicio10 {
	
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double precoAVista;
		int qtdeParcelas;
		double valorParcelas;
		double JUROS_MÊS = 0.02;
		double jurosTotal; // J = C * I * T;
		
		System.out.println("DIGITE O PREÇO À VISTA:");
		precoAVista = scan.nextDouble();
		
		System.out.println("DIGITE A QUANTIDADE DE PARCELAS");
		qtdeParcelas = scan.nextInt();
		
		
		jurosTotal = precoAVista * JUROS_MÊS * qtdeParcelas;
		
		valorParcelas = (precoAVista + jurosTotal) / qtdeParcelas;
		
		System.out.println("O VALOR DO PRODUTO À VISTA É: " + precoAVista + " R$");
		System.out.println("DIVIDIDO EM: " + qtdeParcelas + "X");
		System.out.println("\nFICARA: " + qtdeParcelas + " PARCELAS DE " + valorParcelas +"R$");
		
				
	}

}
