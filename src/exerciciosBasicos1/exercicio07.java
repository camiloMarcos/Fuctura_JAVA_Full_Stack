/* 	07 Crie um programa que leia o peso de uma encomenda (em kg)
	e escreva  o valor do frete (considerando que cada kg custa R$5,00).*/

package exerciciosBasicos1;

import java.util.Scanner;

public class exercicio07 {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double peso;
		double valorFrete;
		double CUSTOKG = 5.00;
		
		System.out.println("DIGITE O PESO DA ENCOMENDA (em Kg):");
		peso = scan.nextDouble();
		
		valorFrete = peso * CUSTOKG;
		
		System.out.println("SEGUE DADOS E VALOR DO FRETE!");
		System.out.println("PESO: " + peso + "Kg");
		System.out.println("CUSTO /KG É DE: " + CUSTOKG + "R$\n");
		
		System.out.println("FRETE É DE: " + valorFrete + "R$");
//		System.out.printf("O frete é de %f.", valorFrete); // 2%f ta dando erro no calculo
		
	}

}
