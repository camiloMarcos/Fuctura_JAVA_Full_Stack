//	Exercício 3 – Soma de N números
//	Peça ao usuário para digitar quantos números ele deseja somar.
//	Em seguida, peça os números e mostre a soma total.

package extras_ExerciociosDeRepatição;

public class Exercicio03 {

	public static void main(String[] args) {
	var scan = new java.util.Scanner(System.in);
	
	System.out.println("DIGITE A QUENTIDADE DE NÚMEROS");
	int qtdeNumero = scan.nextInt();
	int soma = 0;
	int contador =0;
	
//		while(contador < qtdeNumero) {
		for (int i = 1; i <= qtdeNumero; i++) {
			System.out.println("Digite o número");
			int numero = scan.nextInt();
			soma += numero;
			
			contador++;
		}
			System.out.println(soma);

	}

}
