//	06 Mês do Ano
//	Peça ao usuário um número de 1 a 12 e exiba o mês correspondente.
//	Se o número for inválido, exiba uma mensagem de erro

package extras_ExerciciosDeCondicional_Simples;

import java.util.Scanner;


public class SwitchCase06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("DIGITE UM NÚMERO ENTE (1-12), QUE CORRESPONDA OS MESES DO ANO!");
		int numero = scan.nextInt();
		String mes="";
		
		switch (numero) {
		case 1: mes = "JANEIRO"; System.out.println(mes);
		break;
		case 2:	mes = "FEVEREIRO"; System.out.println(mes);
		break;
		case 3: mes = "MARÇO"; System.out.println(mes);
		break;
		case 4: mes = "ABRIL"; System.out.println(mes);
		break;
		case 5: mes = "MAIO"; System.out.println(mes);
		break;
		case 6: mes = "JUNHO";System.out.println(mes);
		break;
		case 7: mes = "JULHO"; System.out.println(mes);
		break;
		case 8: mes = "AGOSTO";System.out.println(mes);
		break;
		case 9: mes = "SETEMBRO"; System.out.println(mes);
		break;
		case 10: mes = "OUTUBRO";System.out.println(mes);
		break;
		case 11: mes = "NOVEMBRO"; System.out.println(mes);
		break;
		case 12: mes = "DEZEMBRO";System.out.println(mes);
		break;
		default:
			System.out.println("OPÇÃO INVÁLIDA, por favor digite um número entre (1-12)");
		}

		
	}

}
