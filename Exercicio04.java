package aula19_Arrays;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		/*Criar um vetor A com 15 elementos inteiros. Construir um vetor B
		 *  de mesmo tipo e tamanho sendo que cada elemento do vetorB
		 *  deverá ser a raiz quadra do respectivo elemento de A, ou seja:
		 *   B[i] = Math.sqrt(A[i]).*/
		Scanner ler = new Scanner(System.in);
		double [] vetorA = new double [5];
		double [] vetorB = new double [vetorA.length];
		
		for(int i=0;i<vetorA.length;i++) {
			System.out.println("Digite o valor do VetorA na posicao "+i);
			vetorA[i] = ler.nextInt();
			vetorB[i] = Math.sqrt(vetorA[i]);
		}
		System.out.println("");
		
		System.out.print("VetorA = ");
		for(int i=0;i<vetorA.length;i++) {
			System.out.print(vetorA[i]+" ");
		}
		System.out.println("");
		
		//para formatar numeros usando o metodo abaixo
		DecimalFormat decimalFormat = new DecimalFormat("R$###,###.##");
		
		System.out.print("VetorB = ");
		for(int i=0;i<vetorB.length;i++) {
			System.out.print(decimalFormat.format(vetorB[i])+" = ");
		}
	}
}
