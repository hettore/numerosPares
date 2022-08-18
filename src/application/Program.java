package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		int vetor[] = new int[n];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
			
		}
		
		System.out.print("Valores: ");
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("%d ", vetor[i]);
		}
		
		System.out.println();
		System.out.print("Números pares digitados: ");
		//int conta = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.printf("%d ", vetor[i]);
			}
		}
		System.out.println();
		System.out.print("Quantidade de números pares: ");
		
		int contar = 0;
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i] % 2 == 0) {
				contar++; 
				
			}
			
		}
		System.out.printf("%d ", contar);
		
		sc.close();
	}

}
