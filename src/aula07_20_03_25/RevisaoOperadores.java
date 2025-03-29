package aula07_20_03_25;

public class RevisaoOperadores {

	public static void main(String[] args) {
		//OPERADOR UNÁRIO
				int x = 1;
			
				// x++ -> x = x + 1;
				System.out.println(x++); 	// -> x=2;
				System.out.println(x);
				System.out.println(++x);
				System.out.println();

				int y = 2;
				// y-- -> y = y - 1;
				System.out.println(--y);
				System.out.println(y);
				System.out.println(y--);
				System.out.println(y);
				
				System.out.println();
				
				
				
				
				//OPERADOR DE ATRIBUIÇÃO.
				int valor1 = 10;
				int valor2 = 5;
				int valor3 = -5;
				double valor4 = Math.PI;
				
					
				
				valor1 += 3; //  valor1 = valor1 + 3;
				System.out.println(valor1); //13
				
				valor1 -= 3; //  valor1 = valor1 - 3;
				System.out.println(valor1); // Exibe 10
				
				valor1 *= 3; //  valor1 = valor1 * 3;
				System.out.println(valor1); // 30
				
				valor1 /= 3; //  valor1 = valor1 / 3;
				System.out.println(valor1); // 10
				
				valor1 %= 3;
				System.out.println(valor1);
				System.out.println();
	
	
	
	
				// OPERADORES RELACIONAIS
				int numero = 7;
				int numero2 = 4;
				
				boolean resultado = numero == numero2;
				System.out.println(resultado);
				
				System.out.println(numero < numero2);
				System.out.println(numero > numero2);
				System.out.println(numero <= numero2);
				System.out.println(numero >= numero2);
				System.out.println(numero != numero2);
				System.out.println();
	
					//			     falso        verdadeiro
				boolean resultado2 = numero < 3 || numero > 2;

				boolean resultado3 = numero > 3 && numero != 2;
				
				System.out.println("resultado2: " + resultado2);
				System.out.println("resultado3: " + resultado3);
	
	
	}

}
