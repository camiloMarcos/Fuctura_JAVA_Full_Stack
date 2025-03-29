package exercicio_sala_de_aula;
import java.util.Random;
import java.util.Scanner;
		
	public class JokenPo {
				
			public static void main (String[] args) {
			
			Scanner scan = new Scanner(System.in);		// instânciar o metodo Scanner
			Random r = new Random();					// instânciar o metodo Randon
			
	//		int opcaoComputador =0;
			int opcaoComputador = r.nextInt(3);			// estudar r.nextInt(); -> metod Random
			String jogadaComputador;							// instaciei uma variável do tipo String
			
			if (opcaoComputador == 0) {
				jogadaComputador = "Pedra";
			}else if(opcaoComputador == 1) {
				jogadaComputador = "Papel";
			}else {
				jogadaComputador = "Tesoura";
			}
												// instâciei uma variavel menu
			String menu = """								
			DIGITE SUA JOGADA								
			
			1- Pedra										
			2- Papel										
			3- Tesoura										
					
					""";
			
			
			System.out.println(menu);				// imprimindo o menu
			String jogadaUsuario = scan.nextLine();	// armazenando o jodagaUsuario
			
// BLOCO DE COD. LOGICA DO JOGO
			if(! (jogadaUsuario.equalsIgnoreCase("Pedra") || (jogadaUsuario.equalsIgnoreCase("Papel") || (jogadaUsuario.equalsIgnoreCase("Tesoura"))))) {
				System.out.println("JOGADA INVÁLIDA!");
			
			} else if(jogadaUsuario.equalsIgnoreCase(jogadaComputador)) {
				System.out.println("Usuário escolheu: " + jogadaUsuario);
				System.out.println("PC escolheu: " + jogadaComputador);
				System.out.println("EMPATOU");
		
			}else if(
			(jogadaUsuario.equalsIgnoreCase("Pedra") && jogadaComputador.equalsIgnoreCase("Tesoura"))
			||
			(jogadaUsuario.equalsIgnoreCase("Papel")) && jogadaComputador.equalsIgnoreCase("Pedra")
			||
			((jogadaUsuario.equalsIgnoreCase("Tesoura")) && jogadaComputador.contentEquals("Papel"))){
				
				System.out.println("Usuário escolheu: " + jogadaUsuario);
				System.out.println("PC escolheu: " + jogadaComputador);
				System.out.println("VOCÊ VENCEU!");	
			
			}else {
				System.out.println("Usuário escolheu: " + jogadaUsuario);
				System.out.println("PC escolheu: " + jogadaComputador);
				System.out.println("VOCÊ PERDEU!");	
				
			}
			
			
			
			
				
				
			}
}
