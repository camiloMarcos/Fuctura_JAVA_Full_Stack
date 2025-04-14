package exerciciosRecomendados_POO;

public class Ex05_PessoaTeste {

	public static void main(String[] args) {
		
		Ex05_Pessoa p1 = new Ex05_Pessoa();
		
		System.out.println(p1.getNome());
		System.out.println(p1.getIdade());
		System.out.println(p1.getGenero());
		
		p1.setNome("Camilo Marcos");
		p1.setIdade(37);
		p1.setGenero('M');
		
		System.out.println(p1.getNome());
		System.out.println(p1.getIdade());
		System.out.println(p1.getGenero());

	}

}
