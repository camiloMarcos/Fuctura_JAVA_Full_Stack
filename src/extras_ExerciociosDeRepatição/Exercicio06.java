/*
 *	Exercício 6 – Contador regressivo
	Peça um número ao usuário e conte de forma regressiva até zero.
 */

package extras_ExerciociosDeRepatição;

public class Exercicio06 {

	public static void main(String[] args) {
		var scan = new java.util.Scanner(System.in);
		
		System.out.println("DIGITE UM NÚMERO PARA CONTAGEM REGRESSIVA!!!\n");
		int numero = scan.nextInt();
		
		
		System.out.println("A Contagem Regressiva é:");
		
//		for(int i = numero; i >= 0; i--) {
//			System.out.println(i);
		while(numero >= 0) {
			System.out.println(numero);
			numero--;
		}
			
		}

	}


