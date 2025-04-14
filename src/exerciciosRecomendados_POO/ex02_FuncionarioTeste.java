package exerciciosRecomendados_POO;

public class ex02_FuncionarioTeste {

	public static void main(String[] args) {
		ex02_Funcionario f = new ex02_Funcionario();
		
		f.nome = "Marcos";
		f.cargo = "Desenvolvedor Senior";
		f.salario = 23.000;
		
		System.out.println("O salário atual é: " + f.salario);
		f.aumentoSalarial(20);
		System.out.println("O salário reajustado é: " + f.salario);
		
		

	}

}
