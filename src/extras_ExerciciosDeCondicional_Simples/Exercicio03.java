//	Solicite dois números ao usuário e mostre qual é o maior.

package extras_ExerciciosDeCondicional_Simples;

public class Exercicio03 {

	public static void main(String[] args) {
		var scan = new java.util.Scanner(System.in);
		
		System.out.println("DIGITE O PRIMEIRO NÚMERO");
		int numPrim = scan.nextInt();
		
		System.out.println("DIGITE O SEGUNDO NÚMERO");
		int numSeg = scan.nextInt();
		
		if (numPrim == numSeg) {
			System.out.println("SÃO IGUAIS!");
		}else if (numPrim > numSeg) {
			System.out.println(numPrim + " é Maior que " + numSeg);
		}else {
			System.out.println(numSeg + " é Maior que " + numPrim);
		}
		scan.close();
	}

}
