/* 	2) Classe Funcionário:
	Crie uma classe Funcionario com os atributos nome, cargo e salario.
	Implemente métodos para definir e obter os valores dos atributos,
	bem como um método para aumentar o salário em uma certa porcentagem*/

package exerciciosRecomendados_POO;

public class ex02_Funcionario {				// Definindo a classe "modelo"

	//Atribultos	
	String nome;
	String cargo;
	double salario;
	
	//Métodos
	
	public String obterNome() {
		return nome;
	}
	
	public String obterCargo() {
		return cargo;
	}
	
	public double calculoAumento(double porcentagem) {
		return salario * (porcentagem/100);
	}
	
	public void aumentoSalarial(double porcentagem) {
		salario += calculoAumento(porcentagem);
	}
	

}
