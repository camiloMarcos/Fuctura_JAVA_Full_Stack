//	Crie um programa que peça dois números e uma operação (+, -, *, /) e use switch-case para calcular e exibir o resultado.

package extras_ExerciciosDeCondicional_Simples;
import java.util.Scanner;


public class SwitchCase03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("INFORME O PRIMEIRO NUMERO");
		double numero1 = scan.nextDouble();
		
		System.out.println("INFORME O SEGUNDO NUMERO");
		double numero2 = scan.nextDouble();
		
		System.out.println("""
				INFORME A OPERAÇÃO
				1 - (+)
				2 - (-)
				3 - (*)
				4 - (/) 
				""");
		int operador = scan.nextInt();
		
		double resultado;
	
		
		switch (operador) {
			case 1:
			resultado = numero1 + numero2;
			System.out.printf("voce escolheu soma, %.2f + %.2f \n", numero1, numero2);
			System.out.println("O resultado da operação foi: " + resultado);
			break;
			case 2:
			resultado = numero1 - numero2;
			System.out.printf("voce escolheu subtraição, %.2f - %.2f \n", numero1, numero2);
			System.out.println("O resultado da operação foi: " + resultado);
			break;
			case 3:
			resultado = numero1 * numero2;
			System.out.printf("voce escolheu Multiplicação, %.2f * %.2f \n", numero1, numero2);
			System.out.println("O resultado da operação foi: " + resultado);
			break;
			case 4:
			resultado = numero1 / numero2;
			System.out.printf("voce escolheu Dividizão %.2f / %.2f \n", numero1, numero2);
			System.out.println("O resultado da operação foi: " + resultado);
			default:
			System.out.println("OPÇÃO INVÁLIDA, escolha as opções entre (1 -4) !!!!");
			break;	
		}
			scan.close();
	}

}
