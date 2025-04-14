//	08. Tipo de Triângulo
//	Peça ao usuário três lados de um triângulo e classifique-o:
//
//	Equilátero (todos lados iguais)
//
//	Isósceles (dois lados iguais)
//
//	Escaleno (todos os lados diferentes)
//	Se os lados não formarem um triângulo válido, informe isso.

package extras_ExerciciosDeCondicional_Simples;
import java.util.Scanner;

public class SwitchCase08_Refazer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		
		System.out.println("""
				INFORME O TAMANHO DOS LADOS DE UM TRIANGULO
				- LADO A
				- LADO B
				- LADO C
				""");
		
		System.out.println("Digite o tamanho do lado A");
		double ladoA = scan.nextDouble();
		System.out.println("Digite o tamanho do lado B");
		double ladoB = scan.nextDouble();
		System.out.println("Digite o tamanho do lado C");
		double ladoC = scan.nextDouble();
		
		String triangulo ="";
		
		if(ehTriangulo(ladoA,ladoB,ladoC)) {		
		
			if(ladoA==ladoB && ladoA==ladoC) {
				triangulo = "Equilátero";
				System.out.println("O triângulo é "+ triangulo + " pois seus lados são iguais.");
		
			}else if ((ladoA==ladoB && ladoA!=ladoC)||(ladoA==ladoC && ladoA!=ladoB)||(ladoB==ladoC && ladoB!=ladoA)) {
				triangulo = "Isósceles";
				System.out.println("O triângulo é "+ triangulo + " pois tem dois  lados iguais.");
		
			}else if (ladoA!=ladoB && ladoA!=ladoC && ladoC!=ladoB) {
				triangulo = "Escaleno";
				System.out.println("O triângulo é "+ triangulo + " pois seus lados são Diferentes.");
			}else {
				System.out.println("Os lados não formaram um triângulo válido!!!");
		}
		}
		
	}

		private static boolean ehTriangulo(double ladoA, double ladoB, double ladoC) {
				// TODO Auto-generated method stub
				return (ladoA + ladoB > ladoC) && (ladoA + ladoC > ladoB) && (ladoB + ladoC > ladoA);
				
	}
		
}


