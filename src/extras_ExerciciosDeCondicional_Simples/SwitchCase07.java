//	07. Turno do Dia
//	O usuário deve digitar uma letra (M, V ou N), e o programa deve exibir:
//
//	M → "Matutino"
//	V → "Vespertino"
//	N → "Noturno"
//	Se for outra letra, exiba "Opção inválida".


package extras_ExerciciosDeCondicional_Simples;

public class SwitchCase07 {

	public static void main(String[] args) {
		var scan = new java.util.Scanner(System.in);
		
		System.out.println("""
				DIGITE UMA DAS LETRAS
				- M
				- V
				- N
				""");
		char opcaoLetra = scan.next().toUpperCase().charAt(0);		// .toUpperCase() converte todas as letras de uma String para maiúsculas.
		String periodo="";
		
		switch (opcaoLetra) {
		case 'M':
			periodo = "Matutino";
			System.out.println("Você Digitou 'M' - Logo, o período escolhido foi: " + periodo);
		break;
		case 'V':
			periodo = "Vespertino";
			System.out.println("Você Digitou 'V' - Logo, o período escolhido foi: " + periodo);
		break;
		case 'N':
			periodo = "Noturno";
			System.out.println("Você Digitou 'N' - Logo, o período escolhido foi: " + periodo);
		break;
		default:
				System.out.println("OPÇÃO INVÁLIDA!\nPor favor, digite uma letra (M, V,N)");
			
		}

	}

}
