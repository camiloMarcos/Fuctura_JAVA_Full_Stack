//07 Escreva um programa que leia dois números inteiros e um operador aritmético (+, -, *, /)
//e realize a operação correspondente. Se o operador não for válido, mostre uma mensagem de erro.


package exerciciosBasicos2;

import java.util.Scanner;


public class Exercicio07 {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("DIGITE O PRIMEIRO NÚMERO INTEIRO!");
		double numeroA = scan.nextDouble();
		
		System.out.println("DIGITE O SEGUNDO NÚMERO INTEIRO!");
		double numeroB = scan.nextDouble();
		scan.nextLine();
		
		System.out.println("DIGITE UM OPERADOR ARITIMÉTICO!");
		String operador = scan.nextLine();
		
		switch(operador) {
			case "+":
				System.out.println("RESULTADO DA OPERAÇÃO: " + (numeroA + numeroB));
			break;
			case "-":
				System.out.println("RESULTADO DA OPERAÇÃO: " + (numeroA - numeroB));
			break;
			case "*":
				System.out.println("RESULTADO DA OPERAÇÃO: " + (numeroA * numeroB));
			break;
			case "/":
				System.out.println("RESULTADO DA OPERAÇÃO: " + (numeroA / numeroB));
			break;
			case "%":
				System.out.println("RESULTADO DA OPERAÇÃO: " + (numeroA % numeroB));
			break;
			default:
				System.out.println("OPERAÇÃO INVÁLIDA");
				System.out.println("APENAS OS OPERADORES +  -  *  /  % SÃO ACEITOS!");
		
		
		}
		
	}

}
