// 08 Escreva um programa que leia o preço de um produto e a forma de pagamento escolhida pelo cliente: 
//
// → 1 - em espécie
// → 2 - cartão de crédito
// → 3 - cartão de débito 
//
// Mostre o valor final da compra. 
//
// Considere que o produto tem 10% de desconto se for pago em espécie ou no cartão de débito
// E não tem desconto se for pago no cartão de crédito

package exerciciosBasicos2;

import java.util.Scanner;

public class Exercicio08SwitchCase {
	
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);	
	
		System.out.println("DIGITE O PREÇO DO PRODUTO!");
		double precoSemDesconto = scan.nextDouble();
		
		System.out.println("ESCOLHA A FORMA DE PAGAMENTO");
		System.out.printf("1 - ESPÉCIE\n2 - DÉBITO\n3 - CRÉDITO");
		int formaPagamento = scan.nextInt();
		scan.nextLine();
		
		double precoComDesconto = precoSemDesconto - (precoSemDesconto * 0.10);
		
	
		switch(formaPagamento) {
		case 1:
			System.out.println("FORMA DE PAGAMENTO: ESPÉCIE\nDESCONTO DE 10%.\n\nVALOR A PAGAR: %f" + precoComDesconto);
		break;
		case 2:
			System.out.println("FORMA DE PAGAMENTO: DEBITO\nDESCONTO DE 10%.\n\nVALOR A PAGAR: %f" + precoComDesconto);
		break;
		case 3:
				System.out.println("FORMA DE PAGAMENTO: CRÉDITO\n\nVALOR A PAGAR: %2f" + precoSemDesconto);
		break;
		default:
			System.out.println("OPÇÃO INVÁLIDA!");
			
		}
		
		
		
//		switch(formaPagamento) {
//		case 1:
//			System.out.println("FORMA DE PAGAMENTO: ESPÉCIE\nDESCONTO DE 10%.\n\nVALOR A PAGAR: %f" + (precoSemDesconto - precoSemDesconto *0.10));
//		break;
//		case 2:
//			System.out.println("FORMA DE PAGAMENTO: DEBITO\nDESCONTO DE 10%.\n\nVALOR A PAGAR: %f" + (precoSemDesconto - precoSemDesconto *0.10));
//		break;
//		case 3:
//				System.out.println("FORMA DE PAGAMENTO: CRÉDITO\n\nVALOR A PAGAR: %2f" + precoSemDesconto);
//		break;
//		default:
//			System.out.println("OPÇÃO INVÁLIDA!");
			
		}
		
		
		
	}
	

}
