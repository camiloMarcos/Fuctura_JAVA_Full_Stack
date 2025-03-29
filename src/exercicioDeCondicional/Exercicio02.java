//	02 Crie um programa que recebe uma nota musical (A, B, C, D, E ou F)
//	e fornece informações sobre ela, como a frequência.

package exercicioDeCondicional;
import java.util.Scanner;

	public class Exercicio02 {

		public static void main (String[] args) {
				
					Scanner scan = new Scanner (System.in);
					
					System.out.println("""
							ESCREVA A NOTA MUSICAL!
							- A
							- B
							- C
							- D
							- E
							- F
							""");
					String nota = scan.nextLine();
					
					
					switch (nota) {
					case "A":
						System.out.println("Nota A - FREQ. 100 hz. ");
					break;
					case "B":
						System.out.println("Nota B - FREQ. 200 hz. ");
					break;
					case "C":
						System.out.println("Nota C - FREQ. 300 hz. ");
					break;
					case "D":
						System.out.println("Nota D - FREQ. 400 hz. ");
					break;
					case "E":
						System.out.println("Nota E - FREQ. 500 hz. ");
					break;
					case "F":
						System.out.println("Nota F - FREQ. 600 hz. ");
					break;
					default:
						System.out.println("OPÇÃO INVÁLIDA!");
					break;
					
						
					}
			
			
					scan.close();
			}
}
