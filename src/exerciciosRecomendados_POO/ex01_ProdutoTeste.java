package exerciciosRecomendados_POO;

public class ex01_ProdutoTeste {

	public static void main(String[] args) {
		ex01_Produto k = new ex01_Produto();
		
		k.nome = "kit Relação";
		k.preco = 100;
		k.quantidade = 15;
		
		
		System.out.println("O valor Total em estoque: " + k.valorTotalEstoque());
		

	}

}
