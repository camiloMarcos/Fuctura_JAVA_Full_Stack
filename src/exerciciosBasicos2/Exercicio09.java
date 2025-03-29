// 09 Escreva um programa que leia a temperatura em graus Celsius e converta para graus Fahrenheit ou Kelvin,
//de acordo com a escolha do usuário. 
//
// A fórmula para converter Celsius para Fahrenheit é: 
// F = (C * 9/5) + 32. 
// A fórmula para converter Celsius para Kelvin é 
// K = C + 273.15.

package exerciciosBasicos2;
import java.util.Scanner;

public class Exercicio09 {
		
		public static void main (String [] args) {
			
			Scanner scan = new Scanner (System.in);
			
			System.out.println("DIGITE A TEMPERATURA EM GRAUS CELSIUS!\n");
			double tCelsius = scan.nextDouble();
			
			double tFahrenheit = (tCelsius * 9/5) + 32;
			double tKelvin = tCelsius + 273.15;
			
			System.out.println("DIGITE PARA QUAL ESCALA QUER CONVERTER!\n1 - FAHRENHEIT.\n2 - KELVIN.");
			int escala = scan.nextInt();
			
			
			switch (escala) {
			case 1:
				System.out.println(tCelsius + " graus Celsius.\nCORRESPONDE À: " + tFahrenheit + " FAHRENHEIT.");
			break;
			case 2:
				System.out.println(tCelsius + " graus Celsius.\nCORRESPONDE À: " + tKelvin + " KELVIN.");
			break;
			default:
				System.out.println("OPÇÃO INVÁLIDA");
			}
			
			
			
		}
}
