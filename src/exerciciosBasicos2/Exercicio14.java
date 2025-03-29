// 14 Escreva um programa que leia a hora atual em formato 24 horas (0 a 23) e mostre uma saudação de acordo com o período do dia. 
//
// Se a hora não estiver nesse intervalo, o programa deve mostrar “Hora inválida”.
//
// Por exemplo, se a hora for 8, o programa deve mostrar “Bom dia”.

package exerciciosBasicos2;

import java.util.Scanner;


	public class Exercicio14 {

		public static void main(String[] args) {
		
				Scanner scan = new Scanner (System.in);
				
				System.out.println("DIGITE A HORA ATUAL  (DE 0 À 23)");
				int hora = scan.nextInt();
				

								
				if (hora >= 0 && hora < 12.00) {
					System.out.println("BOM DIA!");
				}else if(hora >= 12.00 && hora <18) {
					System.out.println("BOA TARDE!");
				}else if(hora >= 18 && hora <= 23) {
					System.out.println("BOA NOITE!");
				}else {
					System.out.println("HORA INVÁLIDA!");
				}
		

	}

}
