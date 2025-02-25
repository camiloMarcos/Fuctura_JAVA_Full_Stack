/*	05 Crie um programa que leia o valor de um empréstimo,
	a taxa de juros mensal e o número de meses e escreva o valor da parcela mensal do empréstimo.*/


package exerciciosBasicos1;

import java.util.Scanner;


public class exercicio05 {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double emprestimo;
		int qtdDeVezes;
		double taxaDeJuros;
		
		
		System.out.println("DIGITE O VALOR DO EMPRÉSTIMO:");
		emprestimo = scan.nextDouble();
		
		System.out.println("DIGITE A QUANTIDADE DE PARCELAS:");
		qtdDeVezes = scan.nextInt();
		
		System.out.println("DIGITE A TAXA DE JUROS MENSAL:");
		taxaDeJuros = scan.nextDouble();
		
		
		
		double parcelaSemJuros = emprestimo / qtdDeVezes;
		
		double parcelaComJuros = parcelaSemJuros + (parcelaSemJuros * taxaDeJuros);
		
		System.out.println("O VALOR DA PARCELA É: " + parcelaComJuros);
		
		
		
		
		

		
	}

}
