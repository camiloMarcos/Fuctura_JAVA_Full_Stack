//	Ano Bissexto:
//	Peça um ano ao usuário e determine se ele é bissexto ou não.

package extras_ExerciciosDeCondicional_Simples;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("DIGITE UM ANO!");
		int ano = scan.nextInt();
		
		if ((ano%4 ==0 && ano%100 !=0) || (ano%4==0 && ano%100==0 && ano%400==0)) {
			System.out.println("ANO " + ano +" É BISSEXTO!");
		}else {
			System.out.println("ANO " + ano +" NÃO É BISSEXTO!");
		}
			scan.close();
			
	}

}
