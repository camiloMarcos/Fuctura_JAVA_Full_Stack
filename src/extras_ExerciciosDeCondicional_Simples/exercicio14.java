//	14 Definir se a temperatura está fria ou quente:
//	Peça a temperatura e exiba "Frio" se for menor que 20°C e "Quente" se for maior ou igual a 20°C.


package extras_ExerciciosDeCondicional_Simples;

	public class exercicio14 {

			public static void main(String[] args) {
			var scan = new java.util.Scanner(System.in);
			
			System.out.println("DIGITE A TEMPORATURA DO AMBIENTE!");
			double temperatura = scan.nextDouble();
			
			if(temperatura < 20) {
				System.out.println("FRIO");
			}else {
				System.out.println("QUENTE");
			}
			
			scan.close();
		
	}

}
