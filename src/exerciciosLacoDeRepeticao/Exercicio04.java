//	05 Desenvolva um programa que use um loop while para gerar uma sequência de números pares a partir de 2 
//	e imprima cada número na tela até que o número gerado seja maior do que 20.

package exerciciosLacoDeRepeticao;

public class Exercicio04 {

	public static void main(String[] args) {
	
	
	int numero=2; 
	
	while( numero <= 21) {
		
		if(numero %2==0) {
			System.out.println(numero);
		}
		numero++;
		
	}

	}

}
