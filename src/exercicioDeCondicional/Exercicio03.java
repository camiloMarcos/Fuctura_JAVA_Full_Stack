//	03 Desenvolva um conversor que recebe UMA unidade de medida (metro, centímetro, quilômetro)
//	e converte para outra unidade com base na entrada.


package exercicioDeCondicional;
import java.util.Scanner;


		public class Exercicio03 {
				
				public static void main(String[] args) {
				Scanner scan = new Scanner (System.in);
				
				System.out.println
									("""
									ESCOLHA UMA UNIDADE DE ENTRADA:
									1. cm
									2. m
									3. km
									""");
									int uniEntrada = scan.nextInt();
				
						
				System.out.println
									("""
									ESCOLHA UMA UNIDADE DE SAÍDA:
									1. cm
									2. m
									3. km
									""");
				int uniSaida = scan.nextInt();
				scan.nextLine();
				
				
				System.out.println("DIGITE UM VALOR PARA SER CONVERTIDO!");
				double valor = scan.nextDouble();
				
				
				double resultado = 0;
				
				if (uniEntrada == uniSaida){
					resultado = valor;
				
				}else if (uniEntrada==1 && uniSaida== 2) {
					resultado = valor/100;
					System.out.printf("VOCÊ ESCOLHEU CONVERTER\n%.1f cm\n", valor);
					System.out.printf("Em metros\nO resultado foi:%.1f m",resultado);
				}else if(uniEntrada == 1 && uniSaida == 3) {
					resultado = valor/100000;
					System.out.printf("VOCÊ ESCOLHEU CONVERTER\n%.1f cm\n", valor);
					System.out.printf("Em Quilômetros\nO resultado foi:%f Km",resultado);
				 
				}else if(uniEntrada == 2 && uniSaida == 1) {
					resultado = valor *100;
					System.out.printf("VOCÊ ESCOLHEU CONVERTER\n%.1f m\n", valor);
					System.out.printf("Em Centímetros\nO resultado foi:%.2f cm",resultado);
				}else if(uniEntrada == 2 && uniSaida == 3) {
					resultado = valor/1000;
					System.out.printf("VOCÊ ESCOLHEU CONVERTER\n%.1f m\n", valor);
					System.out.printf("Em Quilômetros\nO resultado foi:%f km",resultado);
				}else if(uniEntrada == 3 && uniSaida == 1) {
					resultado = valor* 100000;
					System.out.printf("VOCÊ ESCOLHEU CONVERTER\n%.1f Km\n", valor);
					System.out.printf("Em Centímetros\nO resultado foi:%f cm",resultado);
				}else if(uniEntrada == 3 && uniSaida == 2){
					resultado = valor * 1000;
					System.out.printf("VOCÊ ESCOLHEU CONVERTER\n%.1f Km\n", valor);
					System.out.printf("Em Metros\nO resultado foi:%f m",resultado);
				} else if ((uniEntrada >=1 && uniEntrada <=3) || (uniSaida>=1 && uniSaida<=3)){
					System.out.println("Valor Convertido é: " + resultado);
				}else {
					System.out.println("Uma das unidades ENTRADA / SAÍDA está INVÁLIDA!");
				}
			}  
		}
		
				
				
				
	//	REGRAS DE CONVERSÃO		
									
				// m -> cm = m *100
				// m -> m = m
				// m -> km = m/1000
				
				// km -> cm = km * 100000.
				// km -> m = km * 1000
				// km -> km = km

				// cm -> cm == cm
				// cm -> m == cm /100;
				// cm -> Km == cm/100000
//
