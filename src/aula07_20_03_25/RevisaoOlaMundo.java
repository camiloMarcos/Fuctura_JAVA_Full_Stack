package aula07_20_03_25;

public class RevisaoOlaMundo {

	public static void main(String[] args) {
		
		String mensagem;			// declarei variavel do tipo String
		mensagem = "Olá Pessoal,";	// Atribuindo valor à variável
		
		String mensagem2 = "Bem Vindo!"; 	// iniciando a variável. 
		
		System.out.println(mensagem); 		// Comando para imprimir no console pulando uma linha
		System.out.print(mensagem2);		// Comando para imprimir no console SEM pular uma linha
		System.out.println();
		System.out.printf("\n%s, em especial, para Camilo.\n\n", mensagem2);	// Comando p/ exibir no console, nesse caso, em formatação. 
		
		
		//tipo de dados numéricos
			int num = 655;
			long num2 = 5485;
			float num3 = 4.85f;
			double num4 = 47.5;	

		//tipo alfanumérico
			char sexo = 'm';
			String nome = "Tadeu";
			
		//booleanos ( true e false )
			boolean eNoite = true;
			
			
			
			System.out.println(num);
			System.out.println(num2);
			System.out.println(num3);
			System.out.println(num4);
			System.out.println(sexo);
			System.out.println(nome);
			System.out.println(eNoite);
			System.out.println();
			
			
			
		//Operadores
		/*
		   + soma
		   - subtração
		   * multiplicação
		   / divisão
		   % resto
			 *  */
			
			
			int valor1 = 25;
			int valor2 = 12;
			int valor3 = -5;
			double valor4 = Math.PI;
			
			int soma = valor1 + valor2;
			int subtracao = valor1 - valor2;
			int multiplicacao = valor1 * valor2;
			double divisao = (double) valor1 / valor2; //casting
			int resto = valor1 % valor2;
			
			System.out.println("Soma: " + soma);
			System.out.println("Subtração: " + subtracao);
			System.out.println("Multiplicação: " + multiplicacao);
			System.out.println("Divisão: " + divisao);
			System.out.println("Resto: " + resto);
			
			// Classe Math
			// Exibir no console em formatação
			System.out.printf("Raiz quadrada: %.2f%n", Math.sqrt(valor1));
			System.out.printf("Potência: %.2f%n", Math.pow(valor2,2));
			System.out.println("Valor absoluto: " + Math.abs(valor3));
			System.out.println("Valor absoluto: " + Math.abs(valor3));
			System.out.println("Arredondado: " + Math.round(valor4));
			System.out.println("Arredondado para cima: " + Math.ceil(valor4));
			System.out.println("Arredondado para baixo: " + Math.floor(valor4));
			
			
	}

}
