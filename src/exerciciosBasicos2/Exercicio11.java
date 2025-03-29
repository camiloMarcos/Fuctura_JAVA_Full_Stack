//11 Escreva um programa que leia o peso e a altura de uma pessoa e calcule o seu índice de massa corporal (IMC). 
//
//Fórmula do IMC: peso / (altura * altura). 
//
//De acordo com o IMC, mostre a classificação da pessoa: 
//
//IMC:Abaixo de 18,5 
//Classificação:Abaixo do peso
//
//IMC:Entre 18,5 e 24,9
//Classificação:Peso normal
//
//IMC:Entre 25 e 29,9
//Classificação:Sobrepeso
//
//IMC:Entre 30 e 34,9
//Classificação:Obesidade grau I
//
//IMC:Entre 35 e 39,9
//Classificação:Obesidade grau II
//
//IMC:Acima de 40
//Classificação:Obesidade grau III

package exerciciosBasicos2;
import java.util.Scanner; 

public class Exercicio11 {
	
		public static void main (String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			
			System.out.println("DIGITE O PESO CORPORAL");
			double peso = scan.nextDouble();
			
			System.out.println("DIGITE A ALTURA");
			double altura = scan.nextDouble();
			
			double imc = peso / (altura * altura);
			
			if(imc < 18.5) {
				System.out.printf("IMC: %f.\nClassificação: ABAIXO DO PESO.", imc);
			}else if(imc >= 18.5 && imc <= 24.9) {
				System.out.printf("IMC: %f.\nClassificação: PESO NORMAL.", imc);
			}else if(imc >= 25 && imc <=29.9) {
				System.out.printf("IMC: %f.\nClassificação: SOBREPESO.", imc);
			}else if(imc >= 30 && imc <= 34.9) {
				System.out.printf("IMC: %f.\nClassificação: OBESIDADE GRAU I", imc);
			}else if(imc >= 35 && imc <= 39.9) {
				System.out.printf("IMC: %f.\nClassificação: OBESIDADE GRAU II", imc);
			}else {
				System.out.printf("IMC: %f.\nClassificação: OBESIDADE GRAU III", imc);
			}
			
			scan.close();
							

		}

}
