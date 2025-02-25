/*03 Crie um programa que leia a distância percorrida por um carro (em km) e 
 * o tempo gasto (em horas) e escreva a velocidade média do carro. */

package exerciciosBasicos1;

import java.util.Scanner;


public class Exercicio03 {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double kmPercorrido;
		double hrGasta;
		double dMetros;
		double tSeg;
		double velocidadeMedia;
		
		
		
		System.out.println("DIGITE A DISTÂNCIA PERCORRIDA EM KM!");
		kmPercorrido = scan.nextDouble();
		
		System.out.println("DIGITE O TEMPO GASTO EM HORAS!");
		hrGasta = scan.nextDouble();
		
		
		dMetros =  kmPercorrido * 1000;
		tSeg = hrGasta * 3600;
		velocidadeMedia = dMetros / tSeg;
		
		
//		System.out.println("A VELOCIDADE MEDIA DO CARRO FOI: " + velocidadeMedia + " m/seg");
		System.out.printf("A VELOCIDADE MEDIA DO CARRO FOI: %.2f", velocidadeMedia);
		System.out.println("\nMETROS/SEGUNDOS");
	
	}

}

/*	OBS. DESCOBRINDO A FORMULA DE CONVERSÃO DE hr PARA seg, FICA FÁCIL
 * 		 FICOU CONFUSO A QUESTÃO DA HORA, PARA INCLUIR MINUTOS ? POR EXEMPLO: 2H E 55 MIM, MAS */

//	OBS. The local variable kmPercorrido may not have been initialized
//	OBS. The local variable hrGasta may not have been initialized

