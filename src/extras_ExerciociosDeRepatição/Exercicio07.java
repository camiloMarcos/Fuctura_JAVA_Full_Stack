/*
 * Peça ao usuário o número de alunos de uma turma.
 * Em seguida, peça a nota de cada um e calcule a média da turma.
 */

package extras_ExerciociosDeRepatição;
import java.util.Scanner;


public class Exercicio07 {

		public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("DIGITE A QUANTIDADE DE ALUNOS!!!");
		int qtdeAlunos = scan.nextInt();
		double soma = 0;
		double media = 0;
		int contador= 1;
		
		while(contador <= qtdeAlunos) {
			System.out.println("DIGITE A NOTA DO ALUNO!");
			double nota = scan.nextDouble();
			soma += nota;
			media = soma/qtdeAlunos;
			contador++;
			
		}
			System.out.println("A Média da Turma é: " + media);

	}
		
}
