package com.exemplo.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite três números: ");
		
		System.out.print("1º ");
		double num1 = scanner.nextDouble();
		System.out.print("2º ");
		double num2 = scanner.nextDouble();
		System.out.print("3º ");
		double num3 = scanner.nextDouble();

		double soma = num1 + num2 + num3;
		double produto = num1 * num2 * num3;
		double media = soma / 3;

		System.out.println("A soma é " + soma);
		System.out.println("O produto é " + produto);
		System.out.println("A média é " + media);
		
		scanner.close();
		
	}

}
