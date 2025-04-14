/*
 * 	Exercício 5 – Senha com validação (while)
	Crie um programa que continue pedindo a senha ao usuário até que ele digite a senha correta ("java123").
	Ao acertar, exiba uma mensagem de "Acesso permitido".
 */

package extras_ExerciociosDeRepatição;
import java.util.Scanner;


public class Exercicio05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		String senhaOriginal = "java123";
		String senha =""; 
	
				while(!senha.equals(senhaOriginal)) {
					 
					System.out.println("DIGITE A SENHA!");
					senha= scan.next();
				}
					System.out.println("Acesso permitido!");
			
					scan.close();
			}
			
	}


/*
 * OBS. O MÉTODO .equals, SERVE PARA COMPARAR Strings.
 */

