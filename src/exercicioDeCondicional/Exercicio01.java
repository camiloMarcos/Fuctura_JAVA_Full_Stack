//	01 Implemente um sistema de semáforo usando switch case.
//	Receba um estado (vermelho, amarelo ou verde) e determine a ação apropriada.

package exercicioDeCondicional;
import java.util.Scanner;

public class Exercicio01 {
		
			public static void main (String[] args) {
					
				Scanner scan = new Scanner(System.in);
				
				System.out.println("""
						ESCOLHA A COR DO SEMÁFORO!
						- Vermelho
						- Amarelo
						- Verde
						""");
				String semaforo = scan.nextLine();
				
				switch (semaforo) {
				
				case "Vermelho":
					System.out.println("PARE!");
					break;
				case "Amarelo":
					System.out.println("ATENÇÃO!");
					break;
				case "Verde":
					System.out.println("SIGA!");
					break;
				default:
					System.out.println("AÇÃO INVALIDA");
				
				
				}
				scan.close();
			}
	

}
