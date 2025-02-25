/*09 Crie um programa que leia a altura e largura de uma parede (em metros) 
 e escreva a área da parede e a quantidade de tinta necessária para pintá-la
 (considerando que cada litro de tinta pinta 2m²).

Fórmula para cálculo de área: 
area = altura * largura;*/

package exerciciosBasicos1;

import java.util.Scanner;

public class exercicio09 {
	
	
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		
		double altura;
		double largura;
		double areaTotal;
		double relacaoTintaArea;
		double quantidadeTinta;
		
		System.out.println("DIGITE A ALTURA DA PAREDE:");
		altura = scan.nextDouble();
		
		System.out.println("DIGITE A LARGURA DA PAREDE");
		largura = scan.nextDouble();
		
		
		areaTotal = altura * largura;
		
		relacaoTintaArea = areaTotal / 2;
		
		quantidadeTinta =  areaTotal * relacaoTintaArea;
		
		System.out.printf("SUA PAREDE TEM: %f m2.", areaTotal);
		s
		
		
		
		
	}

}
