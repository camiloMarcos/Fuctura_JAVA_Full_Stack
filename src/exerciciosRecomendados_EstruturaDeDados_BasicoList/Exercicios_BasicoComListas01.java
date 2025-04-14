
// 1) Crie uma Lista com vinte números aleatórios.
 

package exerciciosRecomendados_EstruturaDeDados_BasicoList;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Exercicios_BasicoComListas01 {

	public static void main(String[] args) {
		
		List<Integer> numerosAleatorios = new ArrayList<>(); 
		Random rand = new Random();
		
		for (int i=0; i<10; i++) {
			numerosAleatorios.add(rand.nextInt(100)+1);
		}
			System.out.println("Lista de números aleatórios!");
			System.out.println(numerosAleatorios);
		
		
		// 2) ADICIONE O NUMERO 11 À LISTA CRIADA NO EXERCÍCIO ANTERIOR.
		numerosAleatorios.add(11);			// Adicionei apenas um elemento 11.
		System.out.println(numerosAleatorios);

		//3) RREMOVA APENAS O NUMERO NA 5ª POSIÇÃO DA LISA.
		numerosAleatorios.remove(5);		// .remove(5); -> remove no Index específico.
		System.out.println(numerosAleatorios);
		
		
		//4) CONCATENE A LISTA ATUAL COM UMA NOVA LISTA CONTENDO OS NÚMEROS DE 12 À 15.
		List<Integer> novaLista = new ArrayList<>();
		for (int i = 12; i <=15; i++) {			//Usei um laço for para adicionar um 
		novaLista.add(i);}
		System.out.println("novaLista:");
		System.out.println(novaLista);
		
		numerosAleatorios.addAll(novaLista);	// .addAll(novaLista) -> Concatena a lista especificada entre (parenteses)
		System.out.println("Resultado da concatenação das Listas.");
		System.out.println(numerosAleatorios);
		
		
		// 5) ENCONTRE O COMPRIMENTO DA LISTA RESULTANTE.
		System.out.println("\nO comprimento da List é:");
		System.out.println(numerosAleatorios.size());	//Para obter o comprimento da List, usamos o método .size()
	
		
		// 6) VERIFIQUE SE O NÚMERO 8 ESTÁ PRESENTE NA LIST.
		System.out.println(numerosAleatorios.contains(8));	// O método .contains() -> Verifica se um elemento existe na lista.

		
		// 7) INVERTA A ORDEM DOS ELEMENTOS NA LIST.
		Collections.reverse((numerosAleatorios));	// Collections.reverse =>  é usado para inverter a ordem dos elementos de uma lista.
		System.out.println(numerosAleatorios);
		
		
		// 8) REMOVA TODOS OS NUMEROS PARES DA LISTA.
		List<Integer> listImpares = new ArrayList<>();		// Para Remover os pares, precisamos criar uma nova List, de números impares.
		
		for(int i=0; i< numerosAleatorios.size(); i++) {	// Loop for para percorrer e verificar todos os elemenos da List. 
			
			if(numerosAleatorios.get(i)%2 != 0) {	// Condição de cada elemento para ser IMpar
				
			listImpares.add(numerosAleatorios.get(i));
			}
		}
		 numerosAleatorios.removeAll(numerosAleatorios);	// poderiamos usar o método => .removeIf(n -> n % 2 == 0);
		 numerosAleatorios.addAll(listImpares);
		 System.out.println(numerosAleatorios);
		 
		 
		 
		 // 9) SUBSTITUA O VALOR DA 3ª POSIÇÃO POR 30
		 
		 numerosAleatorios.set(2, 30);
		 System.out.println(numerosAleatorios);
		 
		 
		 // 10) ORDENE A LIST DE FORMA CRESCENTE.
		 Collections.sort(numerosAleatorios);	// Collections.sort -> ordenar em ordem crescente.
		 System.out.println(numerosAleatorios);
		
	}

}

/*
	.add -> está relacionado à adição de elementos a uma **coleção**, como uma `List`, `Set`.
 	
 	(rand.nextInt(100)+1) -> Esta linha gera um inteiro aleatório entre **1 e 100** (inclusive).
 	'rand' -> é presumivelmente uma instância de 'java.util.Random'.
 	
 	nextInt(100) -> gera um número de 0 a 99. - Adicionar '1' muda esse intervalo para 1 a 100.
 	
*/