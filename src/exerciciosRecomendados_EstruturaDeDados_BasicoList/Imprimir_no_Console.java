package exerciciosRecomendados_EstruturaDeDados_BasicoList;

public class Imprimir_no_Console {

	public static void main(String[] args) {
		

		// Utilizando System.out.println()
		
//	Imprima seu sobrenome.
	System.out.println("Camilo");

//	Com System.out.println(), exiba o resultado da multiplicação de 3 por 9.
	System.out.println(3*9);

//	Imprima uma frase curta sobre o clima atual usando
	System.out.println("O Clima está muito quente!");	
	
//	Mostre a hora atual!
	System.out.println("São 23:35");
	
//	UTILIZANDO - System.out.print(); //

// imprima seu nome
	System.out.print("Marcos\n");

//	exiba o resultado da soma de 5 + 7.
	System.out.print(5+7 +"\n");
	
//	Imprima uma mensagem com três palavras de sua escolha usando	
	System.out.print("Java é Lindo");
	
//	Mostre a data de hoje (ou qualquer data que você preferir).
	System.out.print("\n06/04/2025\n");
	
	
//	UTILIZANDO System.out.printf()
	
//	imprima seu nome e idade no formato "Nome: [seu nome], Idade: [sua idade]".
	String nome ="Marcos";	int idade = 37;	double peso = 90.5;
		System.out.printf("nome:%s, Idade:%d.\n",nome, idade);
	
//	Exiba o resultado da divisão de 20 por 4 no formato "Resultado: [resultado]".
	double resultado = 20/4;
		System.out.printf("Resultado:%f", resultado);
		System.out.printf("\nResultado:%.2f", resultado);
		System.out.println("");
//	Mostre seu peso com uma precisão de uma casa decimal usando.
		System.out.printf("\nPeso:%.1f",peso);
	
	
	}

}
