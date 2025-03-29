// 03 Faça um programa que leia três notas de um aluno e calcule a média. 
// Se a média for maior ou igual a 7, o aluno está aprovado.
// Se a média for menor que 4, o aluno está reprovado.
// Se a média estiver entre 4 e 7, o aluno precisa fazer uma prova final.
//
// O programa deve escrever a situação do aluno, juntamente com sua média.

package exerciciosBasicos2;
import java.util.Scanner;


	public class Exercicio03 {
	
			public static void main(String [] args) {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("DIGITE O NOME DO ALUNO");
			String aluno = scan.nextLine();
			
			System.out.println("DIGITE A PRIMEIRA NOTA!");
			double nota1 = scan.nextDouble();
			System.out.println("DIGITE A SEGUNDA NOTA!");
			double nota2 = scan.nextDouble();
			System.out.println("DIGITE A TERCEIRA NOTA!");
			double nota3 = scan.nextDouble();
			

			
			double media = (nota1 + nota2 + nota3) /3;
			
			if (media >=7) {
				System.out.printf("PARABÉNS %s,\nSua média foi %.2f. VOCÊ ESTÁ APROVADO!!!", aluno, media);
			}else if (media >= 4 || media >7) {
				System.out.printf("ATENÇÃO %s,\nSua média foi %.2f. VOCÊ PRECISA FAZER UMA PROVA FINAL!!!", aluno, media);
			}else {
				System.out.printf("%s,\nSua média foi %.2f. VOCÊ ESTÁ REPROVADO");
			}
				
			scan.close();
		
			
		}

}
