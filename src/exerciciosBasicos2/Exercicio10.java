// 10 Escreva um programa que leia o salário de um funcionário e aplique um aumento de acordo com a seguinte tabela: 
//
// Faixa salarial: Até R$ 1.500,00 
// Percentual de Aumento: 15% 
//
// Faixa Salarial: De R$ 1.500,01 até R$ 2.500,00 Percentual de Aumento: 10% 
//
// Faixa Salarial: Acima de R$ 2.500,00 
// Percentual de Aumento: 5%

package exerciciosBasicos2;
import java.util.Scanner;


public class Exercicio10 {
	
		public static void main(String[] args) {
			
				Scanner scan = new Scanner(System.in);
				
				System.out.println("DIGITE O SALÁRIO DO FUNCIONÁRIO!");
				double salario = scan.nextDouble();
				
				double reajuste1 = salario * 0.15;
				double reajuste2 = salario * 0.10;
				double reajuste3 = salario * 0.05;
				
				
				if (salario > 2500) {
					System.out.println("SALÁRIO DE: " + salario + ", TERÁ RESJUSTE DE 05%.\n");
					System.out.println("NOVO SALÁRIO: " +  (salario+reajuste3));
				}else if(salario > 1500 && salario <= 2500) {
					System.out.println("SALÁRIO DE: " + salario + ", TERÁ RESJUSTE DE 10%.\n");
					System.out.println("NOVO SALÁRIO: " +  (salario+reajuste2));
				}else {
					System.out.println("SALÁRIO DE: " + salario + ", TERÁ RESJUSTE DE 15%.\n");
					System.out.println("NOVO SALÁRIO: " +  (salario+reajuste1));				
				}
				
				
//				if (salario <= 1500) {
//					System.out.printf("SALÁRIO DE: %f, TERÁ RESJUSTE DE 15%.\nNOVO SALÁRIO: %f", salario, salario+reajuste1);
//				}else if (salario > 1500 || salario <= 2500) {
//					System.out.printf("SALÁRIO DE: %f, TERÁ RESJUSTE DE 15%.\nNOVO SALÁRIO: %f", salario, salario+reajuste2);
//				}else
//					System.out.printf("SALÁRIO DE: %f, TERÁ RESJUSTE DE 15%.\nNOVO SALÁRIO: %f", salario, salario+reajuste3);
//					
//				
				
		}

}
