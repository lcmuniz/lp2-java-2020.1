package com.exemplo.exercicios;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
 
		System.out.print("Qual o número de pessoas? ");
		int quantidade = scanner.nextInt();
		
		if (quantidade <= 0) {
			System.out.println("Quantidade de pessoas inválida");
			System.exit(0);
		}
		
		double soma = 0;
		
		for (int i = 1; i <= quantidade; i++) {
			System.out.print("Idade da pessoa " + i + " ");
			int idade = scanner.nextInt();
			soma = soma + idade;
		}
		
		double media = soma / quantidade;
		
		System.out.println("A média é " + media);
		
		scanner.close();
	}

}
