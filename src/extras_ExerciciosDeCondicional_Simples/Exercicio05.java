//	Verificar se um número é múltiplo de 5:
//	Peça um número ao usuário e informe se ele é múltiplo de 5.

package extras_ExerciciosDeCondicional_Simples;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("DIGITE UM NÚMERO PARA VERIFICAR SE É MÚLTIPLO DE 5!");
			int numero = scan.nextInt();
			
			if (numero%5 == 0) {
				System.out.println("O NÚMERO " + numero + " É MÚLTIPLO DE 5.");
			}else {
				System.out.println("O NÚMERO " + numero + " NÃO É MÚLTIPLO DE 5.");
			}
			
			scan.close();
	}

}
