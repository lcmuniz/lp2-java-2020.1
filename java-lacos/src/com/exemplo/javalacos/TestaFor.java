package com.exemplo.javalacos;

public class TestaFor {

	public static void main(String[] args) {
		
		for (int contador = 0; contador <= 10; contador++) {
			System.out.println(contador);
		}

		int total = 0;
		for (int contador = 0; contador <= 10; contador++) {
			total = total + contador;
		}
		System.out.print("0 + 1 + 2 + ... + 10 = ");
		System.out.println(total);
	}

}
