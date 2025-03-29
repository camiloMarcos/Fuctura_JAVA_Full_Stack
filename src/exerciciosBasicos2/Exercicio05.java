// EXERCÍCIOS BASICOS 2
//05 Escreva um programa que leia o mês do ano em número (1 a 12)
//
//e diga quantos dias ele tem. Considere que o ano não é bissexto.


package exerciciosBasicos2;

import java.util.Scanner;


		public class Exercicio05 {
				
				public static void main(String [] args) {
					Scanner scan = new Scanner(System.in);
					
					System.out.println("DIGITE UM NÚMERO CORRESPONDENTE AOS MESES DO ANO (de 1 à 12)");
					int mes = scan.nextInt();
					
					switch (mes) {
					
					case 1:
						System.out.println("JANEIRO, 31 DIAS");
						break;
					case 2:
						System.out.println("FEVEREIRO, 28 DIAS");
						break;
					case 3:
						System.out.println("MARÇO, 31 DIAS");
						break;
					case 4:
						System.out.println("ABRIL, 30 DIAS");
						break;
					case 5:
						System.out.println("MAIO, 31 DIAS");
						break;
					case 6:
						System.out.println("JUNHO, 31 DIAS");
						break;
					case 7:
						System.out.println("JULHO, 31 DIAS");
						break;
					case 8:
						System.out.println("AGOSTO, 31 DIAS");
						break;
					case 9:
						System.out.println("SETEMBRO, 31 DIAS");
						break;
					case 10:
						System.out.println("OUTUBRO, 31 DIAS");
						break;
					case 11:
						System.out.println("NOVEMBRO, 31 DIAS");
						break;
					case 12:
						System.out.println("DEZEMBRO, 31 DIAS");
						break;
					default:
						System.out.println("OPÇÃO INVALIDA!");
					
					}
					
				}
		}
			

				
