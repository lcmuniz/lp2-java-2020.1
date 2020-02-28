package com.exemplo.exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual a sua idade?");
		
		System.out.print("Anos? ");
		int anos = scanner.nextInt();
		System.out.print("Meses? ");
		int meses  = scanner.nextInt();
		System.out.print("Dias? ");
		int dias = scanner.nextInt();

		int idadeEmDias = (anos * 365) + (meses * 30) + dias;
		
		System.out.print("A sua idade em dias é " + idadeEmDias);

		scanner.close();
		
	}

}
