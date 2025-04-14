/*4) Classe Conta Bancária:
Crie uma classe ContaBancaria com os atributos numero, saldo e titular.
Encapsule os atributos para garantir que apenas métodos da classe possam modificá-los.*/

package exerciciosRecomendados_POO;

public class Ex04_ContaBancaria {
	
	//Atributos
	
	private int numero;
	private String titular;
	private double saldo;
	
	
	
	//Métodos
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	public double deposito(double valor) {
		saldo+=valor;
		return saldo;
	}
	
	public void exibirDados() {
		System.out.printf("Número da conta: %S\nTitular: %s\nSaldo: R$%.1f", numero, titular, saldo);
		
	}
	
	
	
	
}


