//	09 Determinar se uma letra é vogal ou consoante:
//	Peça uma letra e informe se é uma vogal (a, e, i, o, u) ou uma consoante.


package extras_ExerciciosDeCondicional_Simples;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("DIGITE UMA LETRA");
		char letra = scan.next().toLowerCase().charAt(0); 	// next()-> captura 
															//.toLowerCase() ->converte String para minuscula
															//.charAt(0) -> Obtem o primeiro Caracter da String	
		
				if (Character.isLetter(letra)) {			// ele verifica se o caracter digitado é uma letra do alfabeto
					if (letra == 'a' || letra == 'e'|| letra == 'i' ||letra == 'o' ||letra == 'u' ) {
						System.out.printf("A letra %s, É UMA VOGAL", letra);
				}else{
						System.out.printf("A letra %s, É UMA CONSOANTE", letra);
				}
		
				} else {
					System.out.println("CARACTER INVÁLIDO, DIGITE APENAS LETRAS!");
				}
				scan.close();
		
	}		
	
}


