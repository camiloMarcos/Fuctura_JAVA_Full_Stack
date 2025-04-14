//	9. Cardápio de Restaurante
//	Crie um menu onde o usuário pode escolher um prato:
//	1 → Pizza (R$ 25,00)
//	2 → Hambúrguer (R$ 18,00)
//	3 → Salada (R$ 15,00)
//	4 → Refrigerante (R$ 5,00)
//	5 → Sair
//
//	Após a escolha, mostre o nome do prato e o preço.


package extras_ExerciciosDeCondicional_Simples;

public class SwitchCase09 {

	public static void main(String[] args) {
			var scan = new java.util.Scanner(System.in);
			
			System.out.println("""
					"ESCOLHA SEU PEDIDO
					
					1 → Pizza (R$ 25,00)
					2 → Hambúrguer (R$ 18,00)
					3 → Salada (R$ 15,00)
					4 → Refrigerante (R$ 5,00)
					5 → Sair
					""");
			int pedido = scan.nextInt();
			
			String prato ="";
			double preco= 0;
			
			switch (pedido) {
			case 1:
				prato = "Pizza"; preco = 25.00;
				System.out.println("Você escolheu -> " + prato + "\nvalor: "+ preco);
			break;
			case 2:
				prato = "Hamburguer"; preco = 18.00;
				System.out.println("Você escolheu -> " + prato + "\nvalor: "+ preco);
			break;
			case 3:
				prato = "Salada"; preco = 15.00;
				System.out.println("Você escolheu -> " + prato + "\nvalor: "+ preco);
			break;
			case 4:
				prato = "Refrigerente"; preco = 5.00;
				System.out.println("Você escolheu -> " + prato + "\nvalor: "+ preco);
			break;
			case 5:
				
				System.out.println("Você escoleu sair, Obrigado pela preferência..... Volte Sempre!");
			break;
			default:
				System.out.println("OPÇÃO INVÁLIDA,\nDigite o número correspondente ao cardápio!");
				
			}
			scan.close();
	}

}
