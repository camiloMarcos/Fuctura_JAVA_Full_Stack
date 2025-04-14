// Receba uma nota (0 a 10) e exiba a classificação correspondente:
//
//9 ou 10 → "Ótimo"
//7 ou 8 → "Bom"
//5 ou 6 → "Regular"
//3 ou 4 → "Ruim"
//0, 1 ou 2 → "Péssimo"
//Caso o número seja inválido, exiba "Nota inválida".

package extras_ExerciciosDeCondicional_Simples;

	public class SwitchCase05 {

		public static void main(String[] args) {
			var scan = new java.util.Scanner(System.in);
			
			System.out.println("DIGITE A NOTA DO ALUNO!");
			int nota = scan.nextInt();
			
			String situacão="";
			
			switch (nota) {
			case 0, 1, 2:
				situacão = "Péssimo"; System.out.println(situacão);
			break;
			case 3, 4:
				situacão = "Ruim"; System.out.println(situacão);
			break;
			case 5, 6:
				situacão = "Regular"; System.out.println(situacão);
			break;
			case 7, 8:
				situacão = "Bom"; System.out.println(situacão);
			break;
			case 9, 10:
				situacão = "Ótimo"; System.out.println(situacão);
			break;
			default:
				situacão = "Nota inválida";
			break;
				
			}
			
		scan.close();

	}

}
