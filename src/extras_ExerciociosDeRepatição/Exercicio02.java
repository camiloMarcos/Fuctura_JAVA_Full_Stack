//	Exercício02 – Números pares de 1 a 50
//	Faça um programa que mostre apenas os números pares de 1 a 50, utilizando um laço de repetição.



package extras_ExerciociosDeRepatição;

public class Exercicio02 {

	public static void main(String[] args) {
		
		int num = 0;
				
		while(num <= 50) {
			
			if (num % 2 == 0) {
				System.out.println(num);
			}
			num++;
		}

	}

}
