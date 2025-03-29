//13 Escreva um programa que leia um ano e diga se ele é bissexto ou não.
//Um ano é bissexto SE ele for divisível por 4, EXCETO SE ele for divisível por 100 e não por 400. 
//
//Ex:
//2000 é bissexto. restutado fot int
//2100 não é bissexto. resultado for double


package exerciciosBasicos2;
import java.util.Scanner;

public class Exercicio13 {
		
		public static void main (String[] args) {
					
				Scanner scan = new Scanner(System.in);
				
					System.out.println("ESCREVA UM ANO, VERIFICAREMOS SE É BISSEXTO OU NÃO.");
					int ano = scan.nextInt();
					
					if((ano/4 == 0 && ano/100 != 0) || ( ano % 400 == 0 )){
							
							System.out.println("O ANO: " + ano + " É BISSEXTO.");
					}else {
							System.out.println("O ANO: " + ano + " NÃO É BISSEXTO.");
					}
					
					scan.close();
					
				
	
			
		}

}
