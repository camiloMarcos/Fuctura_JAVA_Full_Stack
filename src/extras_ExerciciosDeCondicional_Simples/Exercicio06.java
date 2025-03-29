//	Verificar se um número está dentro de um intervalo:
//	Peça um número e informe se ele está entre 10 e 20.

package extras_ExerciciosDeCondicional_Simples;

public class Exercicio06 {

		public static void main(String[] args) {
		var scan = new java.util.Scanner(System.in);
		
		System.out.println("DIGITE UM NUMERO");
		int numero = scan.nextInt();
		
		if (numero >= 10 && numero<=20) {
			System.out.println("O numero "+ numero + " ESTÁ DENTRO do intervalo do Enunciado!");
		}else {
			System.out.println("O numero "+ numero + " NÃO ESTÁ DENTRO do intervalo do Enunciado!");
		}
		scan.close();

	}

}
