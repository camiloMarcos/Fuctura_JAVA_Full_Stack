/* 02 Crie um programa que leia o preço de dois produtos e escreva o valor total da compra.
 * Lembre-se que valores são números fracionados, ou seja, declare-os com o tipo double.	*/

package exerciciosBasicos1;

import java.util.Scanner;

public class Exercicio02 {
	
		public static void main (String[] args) {
			
			Scanner scan = new Scanner (System.in);
			
			double produtoA;
			double produtoB;
			double valorTotal;
			
			System.out.println("DIGITE O VALOR DO PRODUTO A");
			produtoA = scan.nextDouble();
			
			System.out.println("DIGITE O VALOR DO PRODUTO B");
			produtoB = scan.nextDouble();
			
			valorTotal = produtoA + produtoB;
			
//			System.out.println("VALOR TOTAL: " + valorTotal + "R$");
			System.out.printf("VALOR TOTAL: %.2f.", valorTotal);
			
			
		}

}
