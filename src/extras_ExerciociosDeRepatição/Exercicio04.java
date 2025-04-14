//	Exercício4 – Tabuada personalizada
//	Solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.

package extras_ExerciociosDeRepatição;
import java.util.Scanner;


public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);

		System.out.println("DIGITE UM NÚMERO PARA EXIBIRMOS A TABUADA");
		int numero = scan.nextInt();
		
		System.out.println("\nA Tabuada é:");
		
				for (int i= 1; i<=10; i++) {
				System.out.println(numero*i);	
			
			
		}
		
	}

}
