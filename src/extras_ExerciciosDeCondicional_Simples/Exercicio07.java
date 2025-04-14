//	07 Verificar se uma pessoa pode votar:
//	Peça a idade do usuário e informe se ele pode votar (idade mínima de 16 anos no Brasil).

package extras_ExerciciosDeCondicional_Simples;
import java.util.Scanner;

	public class Exercicio07 {

		public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("DIGITE O NOME DO CIDADÃO!");
//		String nome = scan.nextLine();
		
		System.out.println("DIGITE A IDADE DO CIDADÃO!");
		int idade = scan.nextInt();
		
		
		if(idade <16 && idade>=0) {
			System.out.println("PROIBIDO VOTAR!");
		}else if((idade >=16 && idade < 18) ||(idade >=70)){
			System.out.println("VOTO FACULTATIVO");
		}else if (idade>=18) {
			System.out.println("VOTO OBRIGATÓRIO");
		}else {
			System.out.println("IDADE INVÁLIDA");
		}
			
			scan.close();
	}

}
