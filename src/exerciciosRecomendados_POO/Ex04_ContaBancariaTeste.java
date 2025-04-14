package exerciciosRecomendados_POO;

public class Ex04_ContaBancariaTeste {

	public static void main(String[] args) {
		
		Ex04_ContaBancaria c1 = new Ex04_ContaBancaria();
		
		System.out.println(c1.getSaldo());
		c1.deposito(100);
		System.out.println(c1.getSaldo());
		
		c1.exibirDados();
		
		c1.setTitular("Marcos Camilo");
		c1.setNumero("777");
		c1.setSaldo(200000);
		
//		System.out.println(c1.getNumero() + c1.getTitular() + c1.getSaldo());
		c1.exibirDados();

	}

}
