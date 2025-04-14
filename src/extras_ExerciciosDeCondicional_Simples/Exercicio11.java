//	11 Calcular o preço final de um produto com imposto:
//	Peça o preço de um produto e adicione 15% de imposto caso o valor seja superior a R$ 50,00.


package extras_ExerciciosDeCondicional_Simples;

public class Exercicio11 {

	public static void main(String[] args) {
		var scan = new java.util.Scanner(System.in);
		
		System.out.println("DIGITE O PREÇO DO PRODUTO");
		double preco = scan.nextDouble();
		
		if(preco > 50) {
			preco += 0.15;
			System.out.println("O Valor do Produto Ficará: " + preco);
		}else {
			System.out.println("O Valor do Produto Ficará: " + preco);
		}
		scan.close();
	}

}
