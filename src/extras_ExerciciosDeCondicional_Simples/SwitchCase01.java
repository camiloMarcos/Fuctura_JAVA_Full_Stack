// Escreva um programa que recebe um número de 1 a 7 e imprime o dia correspondente da semana. Considere:

package extras_ExerciciosDeCondicional_Simples;

		public class SwitchCase01 {
			public static void main(String[] args) {

				var scan = new java.util.Scanner(System.in);
				
				System.out.println("DIGITE UM NÚMERO ENTRE 1-7, CORRESONDENTE ");
				int numero = scan.nextInt();
				String dia = "";
				switch (numero) {
				case 1:
					dia = "DOMINGO";
					System.out.println(dia);
					break;
				case 2:
					dia = "SEGUNDA-FEIRA";
					System.out.println(dia);
					break;
				case 3:
					dia = "TERÇA-FEIRA";
					System.out.println(dia);
					break;
				case 4:
					dia = "QUARTA-FEIRA";
					System.out.println(dia);
					break;
				case 5:
					dia = "QUINTA-FEIRA";
					System.out.println(dia);
					break;
				case 6:
					dia = "SEXTA-FEIRA";
					System.out.println(dia);
					break;
				case 7:
					dia = "SÁBADO";
					System.out.println(dia);
					break;
				default:
					System.out.println("OPÇÃO INVÁLIDA,\nPOR FAVOR DIGITE UM NÚMERO ENTRE 1-7!");
					
						
				}
		
		

	}

}
