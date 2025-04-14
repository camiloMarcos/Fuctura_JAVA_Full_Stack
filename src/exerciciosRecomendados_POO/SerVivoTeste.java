package exerciciosRecomendados_POO;

public class SerVivoTeste {

	public static void main(String[] args) {
		
		SerVivo s = new SerVivo();
		
		s.nome = "Camilo";
		s.idade = 37;
		
		System.out.println(s.nome);
		System.out.println(s.idade);
		System.out.println();
		
		System.out.println(s.getNome());
		System.out.println(s.getIdade());
		System.out.println();
		
		s.setNome("olimaC");
		s.setIdade(73);
		
		System.out.println(s.nome);
		System.out.println(s.idade);
		System.out.println();
		
		System.out.println(s.getNome());
		System.out.println(s.getIdade());
		
		

	}

}
